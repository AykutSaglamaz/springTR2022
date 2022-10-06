package gun20_AbstractClass_Method;

/*
    1) Abstract method'lari biz abstract siniflarda depolayabiliriz.
    2) Abstract method'lar  a) Method body ({}) kullanmiyoruz
                            b) abstract kavramini access modifier den sonra ve return type once kullaniyoruz
    3) Abstract method'lar icin public, protected ve default access modifier kullanilabiliir fakat private kullanilamaz
            cunku biz cocuk siniflarindan abstract method olusturuyoruz
    4) Abstract sinif, hem concrete hem de abstract methodlara sahip olabilirler. concrete (somut) siniflarda yalnizca concrete methodlar olusturulabilir
        abstract methodlar olusturulamaz
    5) Abstract method'lar cocuk siniflarinda MUTLAKA OVERRIDE edilmesi lazim, aksi durumda CTE alinir
        Not: Eger bir methodun butun cocuk siniflarinda kullanilmasini istiyorsak, biz bu method 'abstract' yapariz dolayisiyla bu method cocuk siniflarinda
                override edilir
    6) Sadece concrete cocuk (alt) siniflar MUTLAKA  abstract methodlari override etmesi lazim, Abstract cocuk siniflarinda abstract methodlar override edilmese de olur
        CTE hatasi alinmaz
    7) Eger bir abstract method, herhangi bir X'in alt (cocuk) sinifinda override edilirse, diger alt siniflarda bunun tekraren override edilemsine gerek yoktur
        ( override zorunlu degildir)
     8) Siniflar esasinda obje olusturmak icin olusturulur fakat Abstract classlarlda obje OLUSTURULAMAZ.
     9) Abstract siniflar birer siniftir (concrete siniflar gibi), ve constructor olusturulabilir fakat bu constructor'lar obje (nesne) olusturmak icin kullanilamaz
        sadece degiskenlere deger atamak icin kullanilabilir
 */
public abstract class Hayvan {

    public abstract void  yemek ();// abstract == soyut



    public void icmek(){// concrete = somut
        System.out.println(" Hayvanlar su icer");





    }





}
