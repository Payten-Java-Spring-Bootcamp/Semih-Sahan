# Imperative Programming ve Declarative Programming kavramlarını kısaca açıklayıp farklarını belirtiniz ?
> **Imperative**: Imperative programlama ile kastedilen, bir programlama dilindeki komutların satır satır emirlerden oluşmasıdır. Örneğin bir robota komut verecek olsaydık:
> - Kolu 10 derece sağa döndür
> - 2 metre yürü
> - Kolu 20 derece sola döndür
> - Benzeri emirleri sıralamamız gerekecekti

> **Declarative**: Bu yaklaşıma göre bir programı oluşturan parçalar belirli bir amaca yönelik kodlanır. Örneğin yukarıdaki örneğe devam edecek olursak bir robot programlamada bir odadaki bir masanın üzerinde duran elmayı almak için:
> - Kapıyı aç
> - Kapıdan gir
> - Masayı tespit et
> - Masaya yaklaş
> - Elmayı bul
> - Elmayı al

# Veri tabanlarının sorgu optimizasyonlarında index oluşturmanın avantajı nedir ? Sık index kullanmak bir probleme yol açar mı?
> **İndex Nedir?**
> - İndex kavramı verilerin indeksleme alanlarına göre sıralanmış ve tablo halini almış şekline denilmektedir. Bir tabloda belirli bir sıralama düzenine geçilmek için index kullanılmaktadır.
> **İndex Oluşturmanın Faydaları**
> - Veritabanında veriler çok fazla olduğunda performans açısından düşüklüğe yol açmaktadır. Karmaşık bir yapıda olan verilerde istenilen bilgili bulmak tablo taranır. Bu işlem küçük tablolarda yapmak oldukça basittir. Tablonuzda sürekli olarak yeni veriler geliyorsa tablo taraması yapmak size vakit kaybettireceğinden dolayı index yapısı kullanılarak verilere daha hızlı erişim imkanı sunmaktadır.
> **İndex Oluşturmanın Zararları**
> - İndex oluşturmanın zararlarında bahsederken ilk akla gelen veri tabanına her ekleme (insert), güncelleme (update) ve silme (delete) işlemlerinden sonra index yapısı yeniden inşa edilmektedir.
> - Yeniden inşa edileceğinden dikkat etmemiz gereken hususlar
> - 1. Fazla kullanılmayan sütunlar için index oluşturmamalıyız.
> - 2. Gerekmedikçe index oluşturmamalıyız.
Eğer oluşturursak bu sistemimizin performansını düşürecektir.

# İlişkisel veritabanları için normalizasyon kavramı neyi ifade etmektedir ? İlk 3 normal formu örnek üzerinden açıklayınız.
> Normalizasyon (Ayrıştırma), veritabanlarında çok fazla sütun ve satırdan oluşan bir tabloyu tekrarlardan arındırmak için daha az satır ve sütun içeren alt kümelerine ayrıştırma işlemidir.
<br>
> -  Kısaca ; veri tabanı tasarım aşamasında veri tekrarını, veri kaybını veya veri yetersizliğini önlemek için oluşturulan kurallar.
<br>
> - Normalizasyon yapılırken uyulması gereken kurulların her birine normal form adı verilir.
<br>
> - Normalizasyon 6 kademeden oluşmaktadır. Fakat bu kademelerden 3 ‘ü yapılmışsa tablomuz normalizasyon kurallarına uygun denir.
<br>
> - Normalizasyon Kuralları
> - 1NF , 2NF,  3NF, BCNF(Boyce -Codd Normal Form), 5NF, 6NF
<br>
> - & İlk üç kural ihlal edilirse:
<br>
> – Kayıt güncelleme
<br>
> – Kayıt silme
<br>
> – Kayıt bulmada zorluk çekilir.
<br>
> **Normalizasyon Amaçları**
<br>
> **Veri Bütünlüğünün Sağlanması**
> – Gereksiz veri tekrarını önleyerek verilerdeki bozulmaları önlemek
<br>
> **Uygulamadan Bağımsızlık**
> – Uygulama değişse bile veritabanı tutarlı olarak çalışmalı
<br>
> **Performansı Arttırmak**
> – Veri tekrarı en aza iner ve arama hızlı olur.

> **Birinci Normal Form -1 (First Normal Form)  1NF**
<br>
> - Aynı tablo içinde tekrarlayan kolonlar olmamalıdır,
> - Her kolonda yalnızca bir değer bulunabilir,
> - Bir alan içerisindeki bilgi özel karakterlerle ayrılarak tutulmamalıdır,
> - Her satır bir eşsiz anahtarla tanımlanmalıdır. (Unique Key – Primary Key)

> **İkinci Normal Form -2 (Second Normal Form) 2NF**
<br>
> - Tablo 1NF olmalıdır,
> - Anahtar olmayan değerler ile kompozit (bileşik) anahtarlar arasında kısmi (partial) bağımlılık durumu oluşmamalıdır. Kısmi bağımlılık durumu, anahtar olmayan herhangi bir değer kompozit bir anahtarın yalnızca bir kısmına bağıl ise oluşur.
> - Herhangi bir veri alt kümesi birden çok satırda tekrarlanmamalıdır. Bu tür veri alt kümeleri için yeni tablolar oluşturulmalıdır.
> - Ana tablo ile yeni tablolar arasında, dış anahtarlar (foreign key) kullanılarak ilişkiler tanımlanmalıdır.

> **Üçüncü Normal Form -3 (Third Normal Form) 3NF**
<br>
> - Veri tabanı 2NF olmalıdır,
> - Anahtar olmayan hiç bir kolon bir diğerine (anahtar olmayan başka bir kolona) bağıl olmamalıdır. Her kolon eşsiz anahtara tam bağımlı olmak zorundadır.
> - 3NFde olan tablolar 1NF ve 2NFye uygundur. 2NFde olan tablolarda 1NFye uygundur.

# ORM kütüphaneleri kullanmak her zaman avantajlı mıdır ? ORM kütüphanelerinin ne gibi dezavantajları olabilir ?
> ORM kullanmanın dezavantajları
> - ORM kullanmak performans olarak daha yavaş olmasına sebep olur.
> - Veritabanı nesneler üzerinden modellendiğinden nesneler arasında bağ bulunmaktadır. 
> - Bilinçsiz yapılan müdahaleler ile bağlantıyı bozma durumu bulunmaktadır.
> - İlk kez başlayacak olanlar için yazım kuralları (syntax) farklı gelebilir.

# Domain Specific Language (DSL) kavramını açıklayınız.
> - Programlama dilleri, özel(Domain Specific Language) ve genel (General Purpose Language) kapsamda kullanılan diller olarak ikiye ayrılabilir. DSL (Domain Specific Language), özel bir uygulama alanı için kullanılan dildir. DSL Örneği olarak web uygulaması geliştireceksiniz ve uygulamanın özel bir kapsamı olan tasarım konusunda CSS'i verebiliriz. CSS demişken, Sass ve LESS örneklerini de verebiliriz. Bu web uygulamasını elbette HTML kullanarak yapmanız gerektiğine göre bu arkadaşı da DSL kapsamına alabiliriz. Örneğin java ile uygulama geliştiriyorsunuz ve veritabanı işlerini SQL ile yaparken, build ve deploy işlemleri için ANT kullanıyorsunuz. Bu iki arkadaş da çılgınlar gibi biz de DSL'iz diye bağırmıyorlar mı sizce de?
<br>
<br>
> Genel amaçlı (GPL, General Purpose Language) diller birçok konuya özgün kullanılabilen dillerdir örneğin Java, C, UML vs. Mesela Java ile mimarlık, elektronik, Devlet Su İşleri, pideci amcanın dükkanına projeler geliştirebilirsiniz.

# Long lived transaction kavramı hangi tip transactionları ifade etmektedir ? Dezavantajları var mıdır ? Varsa nelerdir ?
> Uzun ömürlü bir işlem, birden çok veritabanı işlemini kapsayan bir işlemdir. İşlemin "uzun ömürlü" olduğu kabul edilir, çünkü sınırları iş mantığı gereği tek bir veritabanı işlemini geçmelidir. Uzun ömürlü bir işlem, tek bir atomik sonuç elde etmek için gruplandırılmış bir dizi veritabanı işlemi olarak düşünülebilir. **Bu gibi durumlar için farklı transaction managment yöntemleri vardır**

# Thread Pool nedir ? Nerelerde kullanılır ?
> Thread Pool'dan önce Multi Threadingi açıklamak daha doğru olsa gerek, multi threading dediğimiz, bizim farklı process'lerimiz olmakta bu processler normalda yani single threading yönteminde sırayla çalışmakta ama biz multi threading ile bu processlerin birbirleriyle haberleşerek, söz vererek çalışmasını, bazen paralel olarak yani aynı anda çalışmasını sağlayabiliriz, process'lerimiz task queue de tutulur ve her bir process thread pool üzerinde boş olan bir yere atanıp tamamlanır ve serbest bırakılır.

# Scalability nedir ? Horizontal ve Vertical Scalability kavramlarını açıklayınız
> **Yatay Ölçeklenebilirlik Nedir ?**
<br>
> - Sistemin/Veritabanının Yatayda ölçeklenebilir olması (horizontally scalable, scale out); ucuz ve çok sayıda makinenin aynı anda kullanılması anlamına gelir. Yatay ölçeklenebilirlik sayesinde yedeklilik de performans artışı da sağlanabilir.

> **Dikey Ölçeklenebilirlik Nedir ?**

> - Sistemin/Veritabanının Dikeyde ölçeklenebilir olması (dikey ölçeklenebilirlik, vertically scalable, scale up); bir tane çok güçlü aynı zamanda pahalı bir makine/donanım kullanılmasıdır. Dikey Ölçeklenebilir sistemlerde donanım kısıtları mevcuttur. Örneğin mevcut sisteminizin CPU frekansını 5 ghz yapamazsınız veya 1 tb ram yapamazsınız.
<br>
> - Yatay ölçeklenebilirlikte yüzlerce, binlerce makinelik server (sunucu) ağı kurulabilir. Yatay ölçeklenebilirliğin yönetimi dikey ölçeklenebilirliğe göre daha zordur.Sonuçta onlarca veya yüzlerce makinayı yönetmek, tabi ki tek bir makinayı yönetmekten daha zordur.

# Data replication ve sharding nedir ? Aralarında nasıl bir fark bulunmaktadır ?
> Data Replication
> - Data Replikasyonu, işlem sırasında ortamda biriken verilerin birden fazla konumda tutundurma işlemine verilen addır. Tüm kullanıcılar için, yapılan işlemler adına herhangi bir tutarsızlık veya sapma gibi bir durum oluşmadan veritabanında biriken verileri kaynaklardan alıp, diğer birden farklı kaynaklara taşıma olayıdır. Dağıtılmış veri tabanı olarak oluşturulan bu sistemde, veriler kişinin isteğine göre hareket eder ve iki farklı kullanıcı birbirlerinin çalışmalarına müdahale etmeden görevlerini yerine getirebilirler. Kısacası veri replikasyonu, internet ortamında bir karışıklık oluşmadan verilerin rahatça hareket edebilmesidir.
<br>
> - Bu işlemler sırasında tüm biriken veriler replike edilebilir. Data Replikasyonu, yapılan işlemlerin çoğalmasının farkına vararak saptar. Böylece çoğalan veriler düzgün bir şekilde güncelleme alır ve senkronize işlemi kusursuz şekilde tamamlanır.

> Sharding
> - Database teknolojisinde, tablodaki verilerin yatay olarak çeşitli makinalara dağılması demektir.


