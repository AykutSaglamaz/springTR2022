package Practice1;

public class A35 {
    /*
            Abstract Class ile interface arasindaki farklar nelerdir?
     Methodlar icin:
        1) "abstract class'lar hem "abstract" hem de "concrete" methodlara sahip olabilir.
            Inteface'ler sadece abstract methodlara sahip olabilir
            Not: Eger interface icin concrete method olusturmak istiyorsak, ya "static" yada "default" kavramlarini kullanmamiz lazim.
        2) "abstract class'lardaki methodlar herhangi bir access modifier alabilir
            Interface'lerdeki methodlar KESINLIKLE 'public'tir.
        3) "abstract class'lar constructor vardir, interfacelerde constructor yoktur
            Her ikisinde obje olusturulamaz
       Variable (degisken) icin:
        1) "abstract class'ta tum degisken cesitleri kullanilabilir
            Interface'lerde SADECE 'public', 'static' ve 'final' degiskenleri kullanilabilir
            Not: Interface'de degiskenler final oldugu icin MUTLAKA deger atanmali
        2) Interface'ler yardimiyla classlar icin coklu ebeveynlik kurullabilir ( multiple parents)

        3) Class "extends" class
           Interface "extends" interface
           Class "implements" interface
           interface'ler bir class'in cocugu olamaz.

     */
}
