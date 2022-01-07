### **Pass By Value ve Pass By Reference Kavramları Nedir ?**
>	Bu kavramlar aslında bir fonksiyona parametre olarak verilen değerlerin,referansını mı yoksa gerçek değerini mi vereceğiz bunun ayrımıdır, referans derken değerin bellekte tutulduğu adres, Value derken ise adresin içinde tutulan değer kast edilmektedir.

>	Pass By Value: Bu yöntemde metoda geçilen değer kopyalanıp belleğin farklı bir yerinde tutulur ve fonksiyon içinde yapılan işlemler parametre olarak geçilen orijinal değeri değil kopyasını değiştirir, ancak parametre olarak geçilen orijinal değeri değiştirmenin tek yolu fonksiyon sonucunda değişiklik yaptığımız kopya değeri scope dışındaki orijinal değere eşitlemektir, Java’da tamamen bu yöntem kullanılır

>	Pass By Reference: Bu yöntemde ise parametre olarak direkt bellekteki adres verildiği için Pass By Value yöntemindeki gibi değeri kopyalama işlemi yapılmaz, direkt parametre olarak verilen değer üzerinde işlemler yapılabilir çünkü adresini yani referansını bilmekteyizdir, Java’da bu yöntem kullanılmaz, ancak parametre olarak bir obje verirsek objeler aslında referans tutucular olduğu için fonksiyon içinde orijinal obje üzerinden değişiklikler yapılabilir, ancak C,C++’da olduğu gibi primitive type’ların referansını verme gibi bir özelliğimiz yoktur Java’da

<br/>

### **Immutability Nedir, Neden Önemlidir, Bir Java Sınıfı Nasıl  Immutability Yapılır ?**
>	Immutable (değişmez), nesneler bir kez oluşturulduktan sonra içeriği değiştirilemeyen sınıflardır. Tam tersi olarak, değiştirilebilen sınıflar da Mutable (değişebilir) sınıflardır. Kısacası Immutable nesneler, değişmeyen nesnelerdir. Mesela Java’da String immutable’dır

>	Immutable nesneler, çok iş parçacıklı(multi>threaded) ortamlarda ve streamlerde kullanışlıdır. Değişmeyen nesnelere güvenmek harikadır. Başka bir thread’in nesnesini değiştiren bir iş parçacığının neden olduğu hatalar olabilir. Immutable nesneler, bu sorunların tümünü çözmüş olacaktır.

>	Java’da değişmez sınıf yapmak için aşağıdaki adımları uygulamanız gerekir.
> -	Sınıfı, final anahtarı ile işaretlemek gerekir, böylece genişletilemez (extend edilemez).
> -	Sınıfın tüm alanlarını private yapın, böylece doğrudan erişime izin verilmez.
> -	Değişkenler için setter yöntemleri sağlamayın.
> -	Tüm değiştirilebilen alanları final yapın, böylece yalnızca bir kez atanabilir.
> -	Tüm alanların, constructor aracılığıyla ilk değerlerini atamasını sağla.
> -	Değiştirebilir olan tüm alanların dışarıya nesnelerin klonlanarak dönmesini gerçekleştirin.

> Effective Java’da, **Joshua Bloch** bu etkileyici tavsiyeyi yapar:
> <p>“Classes should be immutable unless there’s a very good reason to make them mutable….If a class cannot be made immutable, limit its mutability as much as possible.”</p>

<br/>

### **Framework Ve Library Arasındaki Fark Nedir ?**
>	Bu konuda farklı tezler var bunlardan birkaçını inceleyelim;
> -	IOC destekleyen ortamlar frameworkdür
> -	Library hazır fonksiyonların olduğu, proje geliştirmemizi hızlandıran yapılardır, frameworklerde aynı şekilde aradaki fark ise frameworkler bize bir yazılım geliştirme prensipi aşılamaya çalışır, bize bir yöntem, bize bir mimari sunar, proje geliştirme akışını framework belirler ancak library kullanırken kontrol bizdedir, istediğimiz yerlerde library kullanabiliriz.

<br/>

### **Java’da Garbage Collector’un Görevi Nedir ?**
>	Garbage collector bellek üzerinde boşa düşmüş yani kullanılmayan hafıza bloklarının, referans edilmesiyle boşu boşuna yer işkal eden objelerin bellekten kaldırılmasını sağlar

<br/>

### **Memory Leak Nedir, Java’da Memory Leak Olur Mu ?**
> -	Programın kullandığı hafıza ile işi bittiği halde ilgili hafıza bloğunu serbest bırakmaması durumudur
> -	Bu durum Java’da ve Garbage Collector kullanan diğer tüm sistemlerde olabilir çünkü program bir nesneyi kullanmasa da referans ediyor olabilir böylece GC referans edilen her hafıza bloğu kullanıldığını sanarak bellekten kaldırmaz yani memory leak meydana gelebilir, o yüzden kod yazarken bunu göz önünde bulundurarak işi bittiği halde hala memory meşgul eden kodlar yazmamalıyız

<br/>

### **Yeni java sürümleri ne sıklıkla çıkmaktadır ?**
>	Oracle, Long>term suppor(LTS) yani uzun süre destekli Java sürümlerini her 3 yılda bir, onun dışında non>LTS sürümleri de her 6 ayda bir çıkarmaktadır.

<br/>

### **Stack ve Heap nedir, Java Stack ve Heap’i nasıl kullanır ?**
> -	Stack’de değer tipleri, pointer ve adresler saklanırken, Heap’de ise referans değerleri saklanmaktadır
> -	Primitive type’lar Stack’de saklanırken non>primitive type’ların değerleri Heap’de saklanmaktadır, referansları ise yine Stack’de tutulur
> -	Stack’e erişim Heap’den daha hızlıdır ve Stack, LIFO mantığında çalışmaktadır
> -	Heap’de veriler karışık tutulurken Stack’de artan>azalan adres şeklinde sırayla tutulur
> -	Stack’deki veri hemen silinirken, Heap’deki veri Garbage Collector algoritmasına bağlı olarak silinir

<br/>

### **OpenJDK ve OracleJDK arasındaki farklar nelerdir ?**
> -	Oracle her üç yılda bir yeni sürüm sunarken, OpenJDK altı ayda bir yeni sürümünü piyasaya sürmektedir
> -	Oracle, sürümleri için uzun vadeli destek sağlar. OpenJDK ise sadece bir sonraki sürüm yayınlanıncaya kadar bir sürümündeki değişiklikleri destekler
> -	Oracle Java SE 8 için ticari bir lisans olmadan ticari veya üretim amaçlı kullanımını yasaklamıştır ancak OpenJDK tamamen açık kaynaklı ve ücretsizdir
> -	OracleJDK yanıt verme ve JVM performansı açısından çok daha iyidir

<br/>

### **@FunctionalInterface anotasyonu nerelerde kullanılabilir, neleri sağlar ?**
> -	Java 8 ile gelmiştir
> -	İçerisinde sadece bir tane abstract metodu olan interface’dir
> -	Lambda expression’ların kullanılabilmesi için tanımlanırlar
> -	Functional interface’ler tanımlanırken, @FunctionalInterface anotasyonu kullanması zorunlu değildir ancak bu anotasyon validasyon yapma amacıyla kullanılır yani eğer anotasyon kullanılırsa ve interface içine birden fazla abstract metot eklemeye çalışılırsa compile error verir

<br/>

### **Java’da hangi functional interface’ler yer almaktadır, yaptığınız araştırmada en popüler/göze çarpanlar hangileridir ?**
> -	ShortToByteFunction
> -	Runnable
> -	ActionListener
> -	Comparable
