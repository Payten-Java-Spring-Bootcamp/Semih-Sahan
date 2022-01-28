# Concurrent programlama ve Parallel Programlama nedir ? Aralarında çalışma şekli olarak nasıl bir fark bulunmaktadır ?

> Bir baristaya 3 kahve siparişi geldi diyelim, barista önce birinci kahveyi yapıp teslim edip sonra iki sonra üçüncü kahveyi yaparsa yani kahve yapma aşamalarının hepsini üç defa tekrar ederse sıradan programlama olurken, eğer üçkahvelik su kaynatıp, üç bardak çıkarıp yan yana koyar ve üç kahveyi aynı anda yaparsa conccurency programlama olur, eğer üç siparişi iki barista hazırlarsa bu da paralel programlama olur.
<br>
Concurrency aynı anda bir çok görevi aynı anda yürütmek Paralellism ise aynı anda bir çok görevi yan yana yürütmek gibi düşünüldüğünde bence en sade şekilde bir anlam kurgusu oluşturulabilir.
<br>
Eşzamanlı bir yaklaşımda, her çekirdek zaman içinde aralarında geçiş yaparak her iki görevi de yürütür. Buna karşılık, paralel yaklaşım görevler arasında geçiş yapmaz, bunun yerine bunları zaman içinde paralel olarak yürütür:
<br>

# Mutex ve Semaphore kavramlarını açıklayınız. Hangi tür durumlarda bunlara başvurmamız gerekir ?
> İşletim sisteminin eş zamanlı çalıştırdığı iş parçacıkları proses olarak adlandırılır. Prosesler de kendi içlerinde eş zamanlı çalışan iş parçacıklarına sahip olabilir ve bunlara da Thread denir.
<br>
Mutex’ler uygulamanın yazıldığı dil ve Runtime tarafından sağlanan basit veri yapılarıdır. Farklı Thread’ler tarafından paylaşılan her bir kaynak için kaynağa olan erişimi düzenlemek üzere bir Mutex yaratılır. Paylaşılan kaynağa erişim yapılan kod bölgesi Critical Section olarak adlandırılır. Kaynakla işi olan Thread, Mutex'in sahipliğini almaya (Acquire) çalışır. Mutex o anda başka bir Thread tarafından tutulmuyorsa Thread Mutex'i alır, Critical Section'a girerek ilgili kaynağı kullanır. Diğer durumda, yani Mutex o anda başka bir Thread tarafından kullanılıyor ise, ikinci Thread işlemci tarafından beklemeye alınır. Mutex'i tutan Thread Critical Section'ı bitirip Mutex'i bırakırken, halihazırda Mutex'in bırakılmasını bekleyen Thread uyandırılır ve Mutex'in sahipliğini alarak Critical Section'a girer ve paylaşılan kaynağa erişim sağlar.
<br>
Semaphore’lar bazı platformlarda Binary ve Counting olarak ikiye ayrılsa da temel olarak bir ya da daha fazla sayıda bulunan kıt kaynağın birçok kullanıcı tarafından sırayla kullanılmasını sağlarlar.
<br>
Basit bir örnek olarak 4 araç kapasiteli bir otopark otomasyon sistemi kullanılabilir. Bu sistemde giriş ve çıkış kapısını kontrol eden iki Thread’li uygulamada Semaphore Count’u 4 verilmiş bir Counting Semaphore kullanılmış olsun. Otopark boşken, giriş kapısını yöneten Thread Semaphore’un Count’u 4 olduğundan ilk 4 araba için Semaphore’ları alarak kapıyı 4 kere açacak, sonraki araçlar için ise Semaphore boş kaldığından Semaphore dolana kadar işlemci tarafından uyutulacaktır. Çıkış kapısından araçlar çıktıkça (yani Semaphore Release edildikçe) giriş kapısını kontrol eden Thread işlemci tarafından uyandırılacak, Semaphore’u tekrar alabilecek ve çıkan araç kadar yeni araç girişine izin verecektir.

# Java’da Error ve Exception arasındaki fark nedir ? Throwable ile ilişkileri nasıldır ? Hangi tür durumlarda Error hangi tür durumlarda Exception meydana gelebilir ? Örneklerler açıklayınız.

> Throwable, error ve exception için kök görevi görür. Error, programın kodu tarafından ele alınamayan kritik bir durumdur. "Exception", programın kodu tarafından ele alınabilecek istisnai durumdur.
<br>
Error ve exception arasındaki önemli fark, error sistem kaynaklarının eksikliğinden kaynaklanır ve exception kodunuzdan kaynaklanıyor.
<br>
Bir error düzeltilemez ancak exception try-catch blokları ile yakalanıp düzeltilebilir yani program koduyla error'ı ele almanın bir yolu yoktur

# Spring’te yer alan @Scheduled anotasyonunun kullanım amaçlarını ve kullanım şeklini açıklayınız.
> Java’da bir taskı zamanlamak için birden çok yapı kullanılabilir. TimerTask, ScheduledExecuterService ya da Spring’in sağladığı @ Schedule anotasyonu ile sağlanabilir.
<br>
Spring Framework bize anotasyonları kullanarak, neredeyse hiç threadler için kod yazmadan tasklarımızı yazmamızı sağlar. Yani bizi daha da soyutlar
<br>
Periyodik olarak yapmak istediğimiz metodun başına @ Scheduled anotasyonunu eklememiz yeterli olur.
Uygulamamıza @ EnableScheduling anotasyonunu ekleriz. Zamanlamak istediğimiz metoda da @ Scheduled anotasyonunu ekleriz. Burada 3 tip Schedule bulunmakta. Bunlar:
fixedDelay : Sabit gecikme süresi ile, taskımız bir önceki taskın bitiminden sonra belirlediğimiz süre kadar bekler. Yani ‘fixedDelay=5000’ dediğimizde önceki taskın bitiminden 5 saniye sonra yeni task başlar. Tasklar arasında 5 saniye olduğundan emin oluruz.
fixedRate: Sabit belirlenen süre ile, taskın gerçekleşeceği zaman bir önceki taskın başladığı zamandan hesaplanır. Yani ‘fixedRate=5000’ dediğimizde önceki task başladıktan sonra 5 saniye içerisinde bu task gerçekleşecek demektir.
cron: Aynı Linux’da bulunan cron yapısını burada da kullanabiliriz. Basit bir cron expression ile işlemlerimizi istediğimiz belli bir periyoda zamanlayabiliriz.
<br>
taskların çalışma sürelerini Spring bize garanti ediyor, ama sıralamasını garanti etmiyor. Yani task2, task1'den önce gerçekleşebilir. İkisi de aynı thread pool üzerinde çalışmakta. Yani concurrent çalışmakta. @ Schedule anotasyonu ile çalışırken default olarak tek bir thread pool bulunuyor. Bu sebeple bunu değiştirmek istersek TaskScheduler interface’ini implement eden ThreadPoolTaskScheduler sınıfından yararlanırız
<br>

# Spring’te yer alan @Async anotasyonunun kullanım amaçlarını ve kullanım şeklini açıklayınız.
> Basitçe söylemek gerekirse, bir bean yöntemine @Async ile açıklama eklemek , onu ayrı bir thread'in yürütmesini sağlar. Başka bir deyişle, arayan, çağrılan yöntemin tamamlanmasını beklemeyecektir.
<br>
Asynchronous process’leri, Java configuration’ı ile enable etmeliyiz(@EnableAsync). @EnableAsync annotationu @Async annotationuna sahip methodları arayacak ve bu methodları background thread pool’larında çalışacaktır.
<br>
ÖNEMLİ BİR NOT : @Async annotationu kullanırken dikkat edilmesi gereken 2 kural vardır.
> - Method public olmalıdır.
> - Aynı class içerisinden @Async bir methodu çağırırsanız çağrılan method asynchronous olarak çalışmaz.

# High Availability (HA) kavramını kısa açıklayınız.

# Entity ve Value Object kavramlarını Domain Driven Design (DDD) kapsamında açıklayınız.

# Ubiquitous Language kavramını DDD kapsamında açıklayınız. Sizce neden önemli olabileceğini belirtiniz.

# Core Domain, Supporting Domain, Generic Domain kavramlarını DDD kapsamında açıklayınız.

# Anemic Domain Model ve Rich Domain Model kavramlarını kıyaslayarak açıklayınız.