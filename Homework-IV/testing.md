# Pratik Test Piramidi

> "Test Piramidi", yazılım testlerini farklı ayrıntı düzeyine sahip kısımlar halinde gruplandırmamızı söyleyen bir metafordur. Ayrıca bu grupların her birinde kaç tane test yaptırmamız gerektiğine dair bir fikir verir. Üretime hazır yazılım, üretime geçmeden önce test gerektirir. Geliştirme ekipleri, sayısız manuel yazılım test uzmanına sahip olmak yerine, test çabalarının en büyük bölümünü otomatikleştirmeye yöneldi. Testlerini otomatikleştirmek, ekiplerin yazılımlarının bozulup bozulmadığını günler ve haftalar yerine saniyeler ve dakikalar içinde bilmelerini sağlar. Otomatikleştirilmiş testlerin körüklediği büyük ölçüde kısaltılmış geri bildirim döngüsü, çevik geliştirme uygulamaları, sürekli teslim ve DevOps kültürü ile el ele gider.

# (Test) Otomasyonunun Önemi
> Kullanıcılar olarak hepimiz her gün giderek artan miktarda yazılımla etkileşime giriyoruz. İnovasyon çarkları daha hızlı dönüyor.
Hızınızı korumak istiyorsanız, yazılımınızı kalitesinden ödün vermeden daha hızlı sunmanın yollarını aramanız gerekir. Uygun bir test takımınız olmadan büyük ölçekli bir projenizi yeniden düzenleme yapmayı denediyseniz, bahse girerim bunun ne kadar korkunç bir deneyim olabileceğini biliyorsunuzdur.

# Test Piramidi
> Mike Cohn , Agile ile Başarılı olmak adlı kitabında bu kavramı ortaya attı . Farklı test katmanları hakkında düşünmenizi söyleyen harika bir görsel metafor. Ayrıca her katmanda ne kadar test yapmanız gerektiğini de söyler.
> <br><br>
> <br>
> <div align="center"><img src="./images/testPyramid.png" alt="test-pyramid" width="400"/></div>
> <br> <br> <br>
> Ne yazık ki, daha yakından bakarsanız, test piramidi kavramı biraz yetersiz kalıyor. Bazıları, Mike Cohn'un test piramidinin adının veya bazı kavramsal yönlerinin ideal olmadığını iddia ediyor ve buna katılıyorum. Modern bir bakış açısından, test piramidi aşırı derecede basit görünüyor ve bu nedenle yanıltıcı olabilir.
> Cohn'un orijinal test piramidinden iki şeyi hatırlamalıyız:
> <br><br>
> 1. Farklı ayrıntı düzeyine sahip testler yazın
> <br>
> 2. Ne kadar yüksek seviye alırsanız, o kadar az test yaptırmanız gerekir
> <br>
> - Çok sayıda küçük ve hızlı birim testi yazın
> - test piramidindeki tek tek katmanların adlarına fazla bağlı kalmayın.

# İnceleyeceğimiz Araçlar ve Kitaplıklar

> JUnit : test yürütücümüz
Mockito : alaycı bağımlılıklar için
Wiremock : harici hizmetleri devre dışı bırakmak için
Anlaşma : CDC testleri yazmak için
Selenium : Kullanıcı arabirimine dayalı uçtan uca testler yazmak için
REST garantili : REST API güdümlü uçtan uca testler yazmak için

# Unit tests
> Test takımınızın temeli, unit testlerinden oluşacaktır. Unit testleriniz, kod tabanınızın belirli bir biriminin ( test edilen konunuz ) amaçlandığı gibi çalıştığından emin olur.Test takımınızdaki unit testlerinin sayısı, diğer test türlerinden büyük ölçüde daha fazla olacaktır.

# What's a Unit?
> Fonksiyonel bir dilde çalışıyorsanız, bir unit büyük olasılıkla tek bir method olacaktır. Birim testleriniz, farklı parametrelere sahip bir methodu çağıracak ve beklenen değerleri döndürmesini sağlayacaktır. Nesne yönelimli bir dilde bir unit, tek bir methoddan tüm bir classa kadar değişebilir.

# Sociable and Solitary
> Bazıları , mükemmel bir izolasyon elde etmek, yan etkilerden ve karmaşık bir test kurulumundan kaçınmak için test edilen konunuzun tüm ortak çalışanlarının (örneğin, test edilen sınıfınız tarafından çağrılan diğer sınıflar) sahte veya taslaklarla değiştirilmesi gerektiğini savunuyor.Şahsen, kendimi her zaman her iki yaklaşımı da kullanırken buluyorum. Gerçek işbirlikçileri kullanmak garip hale gelirse, taklitleri ve taslakları cömertçe kullanacağım. Gerçek işbirlikçiyi dahil etmek bana bir testte daha fazla güven veriyorsa, hizmetimin yalnızca en dış kısımlarını saplayacağım.

# Mocking and Stubbing

> unit test ile yazabildiğin bir şeyi daha üst seviye testlerle yazmamak gerekiyor, testlerin her ortamda çalışabilmesi için mocking kullanmak gerekiyor. Basit bir deyişle, gerçek bir şeyi (örneğin bir sınıf, modül veya işlev) o şeyin sahte bir versiyonuyla değiştirdiğiniz anlamına gelir. Sahte sürüm gerçek gibi görünür ve davranır (aynı yöntem çağrılarına yanıt verir) ancak birim testinizin başında kendinizi tanımladığınız hazır yanıtlarla yanıtlar.

# What to Test?
> Bir unit test sınıfı, en azından sınıfın general interface'ini test etmelidir. Birim testleri yazmaya gelince ince bir çizgi vardır: Önemsiz olmayan tüm kod yollarınızın test edilmesini sağlamalıdırlar. Aynı zamanda, uygulamanıza çok yakından bağlı olmamalıdırlar. Üretim koduna çok yakın testler hızla can sıkıcı hale gelebilir. Üretim kodunuzu yeniden düzenlediğiniz anda size yeni işler çıkartır.  Kod değişiklikleri için bir güvenlik ağı görevi görmelidir testler. Her yeniden düzenleme yaptığınızda, yardımcı olmaktan daha çok size yeni iş çıkmasına neden olan aptal testlerden bıkabilirsiniz.
> <br>
> Peki bunun yerine ne yapmalı? Birim testlerinizde dahili kod yapınızı yansıtmayın. Bunun yerine gözlemlenebilir davranış için test edin. Mesela; 
> <br> 
> x ve y değerlerini girersem sonuç z olur mu şeklinde test yazmak yerine x ve y değerlerini girersem, yöntem önce A sınıfını, ardından B sınıfını çağırır ve ardından A sınıfının sonucunu artı B sınıfının sonucunu döndürür mü? Bu arada private methodlar genellikle bir uygulama detayı olarak düşünülmelidir. Bu yüzden onları test etme dürtüsüne bile sahip olmamalısın. 

# Test Structure
> Test verilerini ayarlayın, Yönteminizi test altında arayın, Beklenen sonuçların döndürüldüğünü iddia edin.
> <br>
> Bu yapıyı hatırlamak için güzel bir anımsatıcı var: BDD'den ilham alıyor . Bu "give", "when", "then" üçlüsüdür, burada given kurulumu, when yöntemin ne zaman çağrıldığını ve then onaylama bölümünü yansıtır. Bu model diğer, daha yüksek seviyeli testlere de uygulanabilir. Her durumda, testlerinizin okunmasının kolay ve tutarlı kalmasını sağlarlar. Üstelik bu yapı göz önünde bulundurularak yazılan testler daha kısa ve daha anlamlı olma eğilimindedir.

# Integration Tests
> Büyük çaplı tüm uygulamalar diğer bazı kısımlarla (veritabanları, dosya sistemleri, diğer uygulamalarla ağ çağrıları) entegre olacaktır. Unit testleri yazarken bunlar genellikle daha iyi izolasyon ve daha hızlı testler bulmak için dışarıda bıraktığınız kısımlardır. Yine de uygulamanız diğer parçalarla etkileşime girecek ve bunun test edilmesi gerekiyor. Integration Testleri yardımcı olmak için vardır. Uygulamanızın dışında yaşayan tüm parçalarla uygulamanızın entegrasyonunu test ederler.
> <br>
> Otomatik testleriniz için bu, yalnızca kendi uygulamanızı değil, aynı zamanda entegre ettiğiniz bileşeni de çalıştırmanız gerektiği anlamına gelir. Bir veritabanıyla entegrasyonu test ediyorsanız, testlerinizi çalıştırırken bir veritabanı çalıştırmanız gerekir. Dosyaları bir diskten okuyabildiğinizi test etmek için diskinize bir dosya kaydetmeniz ve bunu entegrasyon testinize yüklemeniz gerekir.
> <br>
> <br>
> Bir database integration testi şöyle görünür:
> <br>
> 1- bir veritabanı başlat
> <br>
> 2- uygulamanızı veritabanına bağlayın
> <br>
> 3- kodunuz içinde veri tabanına veri yazan bir işlevi tetikleyin
> <br>
> 4- veritabanından verileri okuyarak beklenen verilerin veritabanına yazıldığını kontrol edin
> <br>
> <br>
> Başka bir örnek, hizmetinizin bir REST API aracılığıyla ayrı bir hizmetle entegre olduğunu test etmek şöyle görünebilir:
> <br>
> 1- başvurunu başlat
> <br>
> 2- ayrı hizmetin bir örneğini başlatın (veya aynı arayüze sahip bir çift test)
> <br>
> 3- kodunuzda ayrı hizmetin API'sinden okuyan bir işlevi tetikleyin
> <br>
> 4- uygulamanızın yanıtı doğru şekilde ayrıştırabildiğini kontrol edin

# Contract Tests
>Daha modern yazılım geliştirme kuruluşları, bir sistem geliştirmeyi farklı ekipler arasında yayarak geliştirme çabalarını ölçeklendirmenin yollarını bulmuşlardır. Bireysel ekipler, birbirlerinin ayaklarına basmadan bireysel, gevşek bağlı hizmetler oluşturur ve bu hizmetleri büyük, uyumlu bir sisteme entegre eder. Mikro services etrafında daha yeni yeni konuşulan konu tam olarak buna odaklanıyor.
> <br>
> <br>
> Sisteminizi birçok küçük hizmete bölmek, genellikle bu hizmetlerin belirli interface'ler aracılığıyla birbirleriyle iletişim kurması gerektiği anlamına gelir.
> <br>
> <br>
> Her interface için iki taraf vardır: provider ve consumer. Provider , consumer'lara veri sunar. Consumer , bir provider'dan elde edilen verileri işler.
> <br>
> <br>
> Asenkron, event driven bir dünyada, bir provider (genellikle publisher olarak adlandırılır ) verileri bir queue yayınlar; bir consumer bu queue'lere subscribe olur ve verileri okur, işler.
> <br>
> <div align="center"><img src="./images/contract_tests.png" alt="contract_tests" width="400"/></div>
> <br>
> <br>
> Consumer ve publisher hizmetleri farklı ekiplere sık sık yayarsanız, kendinizi bu hizmetler arasındaki arabirimi (sözde contract ) açıkça belirtmeniz gereken bir durumda bulursunuz. Geleneksel olarak şirketler bu soruna şu şekilde yaklaşmışlardır:
> <br>
> <br>
> - Uzun ve ayrıntılı bir arayüz belirtimi yazın ( contract )
> - Belirlenen contracta göre sağlama hizmetini uygulamak
> - Arayüz spesifikasyonunu çitin üzerinden consumer ekibe atın
> - Arayüzü consume etmenin kendilerine düşen kısmını uygulayana kadar bekleyin
> - Her şeyin işe yarayıp yaramadığını görmek için bazı büyük ölçekli manuel sistem testleri yapın
> - Umarım her iki takım da sonsuza kadar arayüz tanımına sadık kalır ve işleri batırmaz.
> <br>
> <br>
> Daha modern yazılım geliştirme ekipleri, 5. ve 6. adımları daha otomatikleştirilmiş bir şeyle değiştirdi: Automation Contract Test , consumer ve provider tarafındaki uygulamaların hala tanımlanan contracta bağlı kalmasını sağlar.

# Consumer-Driven Contract(CDC)

> CDC kullanarak, bir consumer, interface'den ihtiyaç duydukları tüm veriler için interface'i kontrol eden testler yazar. Consumer ekibi daha sonra bu testleri yayınlar, böylece publish ekibi bu testleri kolayca alabilir ve yürütebilir. Provider ekip artık CDC testlerini çalıştırarak API'lerini geliştirebilir. Tüm testler geçtikten sonra, consume eden ekibin ihtiyaç duyduğu her şeyi uyguladıklarını bilirler.
> <br>
> <br>
> <div align="center"><img src="./images/cdc_tests.png" alt="cdc_tests" width="200"/></div>
> <br>
> <br>
> Bu yaklaşım, provider ekibin yalnızca gerçekten gerekli olanı uygulamasına olanak tanır.
> <br>
> <br>
> Consumer-Driven Contract yaklaşımı, sizi şuna benzeyen bir süreçle baş başa bırakır:
> <br>
> - Consumer ekibi, tüm tüketici beklentileriyle otomatik testler yazar
> - Provider ekip için testleri yayınlarlar
> - Provider ekip, CDC testlerini sürekli olarak çalıştırır ve onları yeşil tutar
> - CDC testleri bozulduğunda her iki takım da birbirleriyle konuşur
> <br> 
> <br> 
> CDC testleri, ekip iletişimini geliştirmenin otomatik bir yoludur.
> <br> 
> <br> 
> Son birkaç yılda CDC yaklaşımı giderek daha popüler hale geldi ve bunları yazmayı ve değiştirmeyi kolaylaştırmak için çeşitli araçlar oluşturuldu. Pakt muhtemelen bugünlerde en belirgin olanıdır.

# UI Tests
> İnsanlar genellikle bir REST API'sinin veya bir komut satırı arayüzünün, süslü bir web kullanıcı arayüzü kadar bir kullanıcı arayüzü olduğunu unutur.
> <br>
> <br>
> <div align="center"><img src="./images/ui_tests.png" alt="cdc_tests" width="200"/></div>
> Web uygulamanızın tasarımını derleme işlem hattınızda otomatik olarak kontrol etmek istiyorsanız deneyebileceğiniz bazı araçlar vardır. Bu araçların çoğu, web uygulamanızı farklı tarayıcılarda ve formatlarda açmak, ekran görüntüleri almak ve bunları önceden çekilmiş ekran görüntüleriyle karşılaştırmak için Selenium'u kullanır. Eski ve yeni ekran görüntüleri beklenmedik bir şekilde farklılık gösteriyorsa, araç sizi bilgilendirecektir. Galen bu araçlardan biridir.

# End-to-End Tests
> Yazılımınızın çalışıp çalışmadığına karar vermeniz gerektiğinde size en büyük güveni verir. Selenium ve WebDriver Protokolü , dağıtılan hizmetlerinize karşı otomatik olarak bir tarayıcı sürerek, tıklamalar gerçekleştirerek, veri girerek ve kullanıcı arabiriminizin durumunu kontrol ederek testlerinizi otomatikleştirmenize olanak tanır. Selenium'u doğrudan kullanabilir veya üzerine inşa edilmiş araçları kullanabilirsiniz, Nightwatch bunlardan biridir.
> <br>
> <br>
> Kullanıcıların uygulamanızla sahip olacağı yüksek değerli etkileşimleri düşünün. Ürününüzün temel değerini tanımlayan kullanıcı yolculukları bulmaya çalışın ve bu kullanıcı yolculuklarının en önemli adımlarını otomatikleştirilmiş End-to-End testlere dönüştürün.
> <br>
> <br>
> Bir e-ticaret sitesi kuruyorsanız, en değerli müşteri yolculuğunuz bir kullanıcının bir ürünü araması, alışveriş sepetine koyması ve ödeme yapması olabilir. Bu kadar. Bu yolculuk hala işe yaradığı sürece, başınız çok fazla belaya girmemelisiniz. Belki uçtan uca testlere çevirebileceğiniz bir veya iki önemli kullanıcı yolculuğu daha bulacaksınız. Bundan daha fazla olan her şey muhtemelen yardımcı olmaktan çok acı verici olacaktır.

# Acceptance Tests — Do Your Features Work Correctly?
> Test piramidinizde ne kadar yukarı çıkarsanız, oluşturduğunuz özelliklerin bir kullanıcının bakış açısından doğru çalışıp çalışmadığını test etme alanına girme olasılığınız o kadar artar.
> x ve y değerlerini girdiğimde, geri dönüş değeri z olmalıdır yerine, oturum açmış bir kullanıcı olduğu düşünüldüğünde ve bir "bisiklet" yazısı var diyelim, kullanıcı "bisiklet" makalesinin ayrıntı sayfasına gittiğinde ve "sepete ekle" düğmesini tıklatır o zaman "bisiklet" yazısı alışveriş sepetinde olmalıdır gibi teslerdir. Bazen bu tür testler için  functional test veya acceptance test terimlerini duyarsınız .

# Exploratory Testing
> En titiz test otomasyonu çabaları bile mükemmel değildir. Bazen otomatik testlerinizde belirli uç durumları kaçırırsınız. Test otomasyonu konusundaki iyi niyetinize rağmen, bazı türlerin manuel olarak test edilmesi hala iyi bir fikirdir. Çalışan bir sistemdeki kalite sorunlarını tespit etmek için testçinin özgürlüğünü ve yaratıcılığını vurgulayan manuel bir test yaklaşımıdır.


> Bazı insanlar için entegrasyon testi, tüm sisteminizin birçok farklı bölümünü test eden çok geniş bir aktivitedir. Benim için oldukça dar bir şey, aynı anda yalnızca bir harici parça ile entegrasyonu test etmek. Bazıları bunlara entegrasyon testleri diyor , bazıları bunlara bileşen testleri diyor, bazıları servis testi terimini tercih ediyor.. Bu üç terimin hepsinin tamamen farklı şeyler olduğunu iddia edecek. Doğru ya da yanlış yok. Yazılım geliştirme topluluğu, test etme konusunda iyi tanımlanmış terimler üzerinde anlaşmayı başaramadı.

> - Daha yüksek seviyeli bir test bir hata tespit ederse ve daha düşük seviyeli bir test başarısız olmazsa, daha düşük seviyeli bir test yazmanız gerekir.
> - Testlerinizi test piramidinin olabildiğince aşağısına itin

# Writing Clean Test Code
> - Test kodu, üretim kodu kadar önemlidir. Aynı düzeyde özen ve dikkat gösterin. "bu yalnızca test kodudur" , özensiz kodu doğrulamak için geçerli bir mazeret değildir
> - Test başına bir koşulu test edin. Bu, testlerinizi kısa tutmanıza ve akıl yürütmesi kolay hale getirmenize yardımcı olur.
> - "arrange, act, assert" veya "given, when, then" , testlerinizi iyi yapılandırılmış tutmak için iyi anımsatıcılardır.
> - Okunabilirlik önemlidir. Aşırı DRY olmaya çalışmayın . Okunabilirliği artırıyorsa, çoğaltma tamamdır. DRY ve DAMP kodu arasında bir denge bulmaya çalışın
> - Şüphe duyduğunuzda, ne zaman yeniden düzenleme yapacağınıza karar vermek için Üçlü Kuralı kullanın. Yeniden kullanmadan önce kullanın

# KAYNAK
> https://martinfowler.com/articles/practical-test-pyramid.html


