# Regression test nedir ? Kısaca açıklayınız.
> Regresyon testi uygulama ortamındaki yapılan tüm değişiklikleri; uygulamaya yeni eklenen özellikler, daha önceki yaşanan hataların düzeltilmesinden sonra, mevcut problemlerin giderildiği ve yeni yapılan güncellemelerin, eklenen özelliklerin yeni bir hata üretip üretmediğini kontrol amaçlı olarak yapılan yazılım test türüdür.
Yani yapılan düzenlemelerin etkileri testler ile analiz edilir

# A/B test nedir ? Kısaca açıklayınız.

> AB testi, esas olarak, bir sayfanın iki veya daha fazla varyantının rasgele kullanıcılara gösterildiği bir deneydir ve hangi varyasyonun belirli bir dönüşüm hedefi için daha iyi performans gösterdiğini belirlemek için istatistiksel analiz kullanılır.

# Black box / white box test kavramlarını açıklayınız.

> 1-Kara Kutu (Black Box) Yaklaşımı
<br>
Bu yaklaşımda sızma testinin yapılacağı sistem ile ilgili bir bilgi önceden verilmez. Test edici bir bilgisayar korsanı gibi sisteme sızmaya çalışır. Hedef sisteme sızmak için sistemle ilgili bilgi toplanır; zafiyetler ve açıklar taranır. Harici veya son kullanıcı bakış açısından test etmeyi içerir. Test edicinin yanlışlıkla sisteme zarar verme ihtimali bulunmaktadır.

> 2- Beyaz Kutu (White Box) Yaklaşımı
<br>
Sızma testini yapacak ekibe firmada bulunan tüm sistemler hakkında bilgiler verilir. Black box yaklaşımına göre kuruma daha fayda sağlanır. Zafiyetleri bulmak kolaylaşır ve önlem alınması için geçen süre de azalmaktadır. Ekibin zarar verme riski çok azdır.

> 3- Gri Kutu (Gray Box) Yaklaşımı
<br>
Gray box testinde firma hakkında sınırlı bilgi verilerek sızma test gerçekleştirilir. Bu test ile firma içerisinde düşük ayrıcalıklara sahip kullanıcıların sistemlere ve firmaya verebileceği zararın test edilebilmesi hedeflenmektedir.

# Mutation test nedir ? Kısaca açıklayınız.

> Mutasyon Testi, kaynak koddaki belirli ifadeleri değiştirdiğimiz(mutant) ve test senaryolarının hataları bulabildiğini kontrol ettiğimiz bir tür yazılım testidir. Temelde birim testi(unit test) için kullanılan bir beyaz kutu testi türüdür. Mutant programdaki değişiklikler son derece küçük tutulur, bu nedenle programın genel hedefini etkilemez.
Mutasyon testinin amacı, mutant kodunu kaldıracak kadar sağlam olması gereken test vakalarının kalitesini değerlendirmektir. Bu yöntem, programda bir hata oluşturmayı içerdiği için hata tabanlı test stratejisi olarak da adlandırılır.

# Behavior Driven Development (BDD) nedir, neyi amaçlamaktadır ?
> BDD ilk olarak 2009 yılında Dan North tarafından ortaya atılmıştır.
<br>
Behavior Driven development (BDD), yazılım süreçlerinin daha test odaklı gitmesini sağlayan bir yaklaşımdır. Aynı zamanda müşteri ile aramızda yaşayan bir döküman oluşmasını sağlayabilir. BDD, Test Driven Development (TDD) gibi prensip olarak öncelikle test kodları yazılsın daha sonrasında proje kodu yazılsın anlayışını benimsemektedir.
<br>
BDD, TDD ’ nin karmaşıklığını gidermek amacıyla çıkmıştır. İkili arasındaki en büyük fark TDD, sizi diğer classlara bağımlılığı az olan, classların sorumluluklarını ayırarak tekrar etmeyen bir kod yazmanızı sağlar. BDD ise, bir sistemin davranışını, bu davranışın nasıl geliştirildiğine dair ayrıntılara yer vermeden tanımlamanıza izin veren bir dildir.
<br>
Önce test yazmanın ek faydası da müşteri ile iletişimin daha kolay hale gelmesi, müşteriye yazdığınız kodu anlatamazsınız ama kodu yazmadan önce işin derinine girmeden yazdığınız testleri anlatabilirsiniz 
<br>
Agile methodundan bahsedecek olursak Agile, kullanıcıyı sürece dahil etmektedir. Agile, kullanıcıyla birlikte tüm organizasyon ve sistemlerini müşteriye göre ayarlamaktadır.
<br>
Agile metodolojisi ile iş yapıyorsanız ve BDD kullanmıyorsanız kendinizle çelişiyorsunuz demektir

# Agile test quadrant nedir ? Quadrant’ların kapsamını kısaca açıklayınız
> Agile Test Quadrants
Test Türlerinin iki yönünü birleştiren Agile Test Quadrant Brian Marick tarafından türetilmiştir
<br>
Agile Test Quadrant, ekiplerin ihtiyaç duyulan testi belirlemesine, planlamasına ve uygulamasına yardımcı olmak için yararlı bir sınıflandırma sağlar.
<br>
Quadrant Q1 − Unit Level, Teknolojiye Yönelik ve geliştiricileri destekler. Unit testleri bu Quadranta aittir. Bu testler Otomatik testler olabilir.
<br>
Quadrant Q2 – System level, işle ilgili ve uygun ürün davranışı. Fonksiyonel testler bu quadranta aittir. Bu testler manuel veya otomatiktir.
<br>
Quadrant Q3 − System or User Acceptance Level, İşe Yönelik ve gerçek zamanlı senaryolara odaklanma. User Acceptance Tests bu çeyreğe aittir. Bu testler manueldir.
<br>
Quadrant Q4 − System or Operational Acceptance Level, Teknolojiyle Karşılaşılan ve Performansa Odaklanma, Load, Stress, Sustainability, Scalability Testleri. Otomasyon testleri ile birlikte bu testler için özel araçlar kullanılabilir.
