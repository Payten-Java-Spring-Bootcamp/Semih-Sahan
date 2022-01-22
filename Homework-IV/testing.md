# Pratik Test Piramidi

> "Test Piramidi", yazılım testlerini farklı ayrıntı düzeyine sahip kısımlar halinde gruplandırmamızı söyleyen bir metafordur. Ayrıca bu grupların her birinde kaç tane test yaptırmamız gerektiğine dair bir fikir verir. Üretime hazır yazılım, üretime geçmeden önce test gerektirir. Geliştirme ekipleri, sayısız manuel yazılım test uzmanına sahip olmak yerine, test çabalarının en büyük bölümünü otomatikleştirmeye yöneldi. Testlerini otomatikleştirmek, ekiplerin yazılımlarının bozulup bozulmadığını günler ve haftalar yerine saniyeler ve dakikalar içinde bilmelerini sağlar. Otomatikleştirilmiş testlerin körüklediği büyük ölçüde kısaltılmış geri bildirim döngüsü, çevik geliştirme uygulamaları, sürekli teslim ve DevOps kültürü ile el ele gider.

# (Test) Otomasyonunun Önemi
> Kullanıcılar olarak hepimiz her gün giderek artan miktarda yazılımla etkileşime giriyoruz. İnovasyon çarkları daha hızlı dönüyor.
Hızınızı korumak istiyorsanız, yazılımınızı kalitesinden ödün vermeden daha hızlı sunmanın yollarını aramanız gerekir. Uygun bir test takımınız olmadan büyük ölçekli bir projenizi yeniden düzenleme yapmayı denediyseniz, bahse girerim bunun ne kadar korkunç bir deneyim olabileceğini biliyorsunuzdur.

# Test Piramidi
> Mike Cohn , Agile ile Başarılı olmak adlı kitabında bu kavramı ortaya attı . Farklı test katmanları hakkında düşünmenizi söyleyen harika bir görsel metafor. Ayrıca her katmanda ne kadar test yapmanız gerektiğini de söyler.
> <img src="./images/testPyramid.png" alt="test-pyramid" width="400"/>
> Ne yazık ki, daha yakından bakarsanız, test piramidi kavramı biraz yetersiz kalıyor. Bazıları, Mike Cohn'un test piramidinin adının veya bazı kavramsal yönlerinin ideal olmadığını iddia ediyor ve buna katılıyorum. Modern bir bakış açısından, test piramidi aşırı derecede basit görünüyor ve bu nedenle yanıltıcı olabilir.
> Cohn'un orijinal test piramidinden iki şeyi hatırlamalıyız:
1. Farklı ayrıntı düzeyine sahip testler yazın
2. Ne kadar yüksek seviye alırsanız, o kadar az test yaptırmanız gerekir
> Çok sayıda küçük ve hızlı birim testi yazın
>  test piramidindeki tek tek katmanların adlarına fazla bağlı kalmayın.

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