//lab 3 text
// Она умолкла и с таким усердием стала мыть посуду, что брызги летели во все стороны.
// Но вдруг она о чем-то вспомнила,с тревогой поглядела на Малыша и спросила:
// Фрекен Бок никак не могла взять в толк, что Карлсон,  который живет на крыше, - красивый, умный, в меру упитанный мужчина в самом расцвете сил.
// Она считала, что он - ровесник Малыша, его школьный товарищ, самый обыкновенный озорник.
// Что этот озорник почему-то умеет летать, ее не удивляло.
// Она думала, что такой моторчик можно купить в игрушечном магазине, были бы только деньги, и все ворчала по поводу того, что теперь так балуют детей.
// "Скоро дело дойдет до того, что дошкольники станут на Луну летать", - говорила она.
// И вот теперь она вспомнила Карлсона и назвала его "этот невоспитанный, толстый мальчишка"...
// Малышу это совсем не понравилось.

//lab 4 text
// Но он явно сделал промах, потому что фрекен Бок резко встала и так при этом двинула стол, что все на нем задребезжало.
// Она умолкла и с таким усердием стала мыть посуду, что брызги летели во все стороны.
// Но вдруг она о чем-то вспомнила, с тревогой поглядела на Малыша и спросила:
// Фрекен Бок никак не могла взять в толк, что Карлсон, который живет на крыше, -- красивый, умный, в меру упитанный мужчина в самом расцвете сил.
// Она считала, что он -- ровесник Малыша, его школьный товарищ, самый обыкновенный озорник.
// Что этот озорник почему-то умеет летать, ее не удивляло.
// Она думала, что такой моторчик можно купить в игрушечном магазине, были бы только деньги, и все ворчала по поводу того, что теперь так балуют детей.
// "Скоро дело дойдет до того, что дошкольники станут на Луну летать", -- говорила она.
// И вот теперь она вспомнила Карлсона и назвала его "этот невоспитанный, толстый мальчишка"...
// Малышу это совсем не понравилось. Но в дверях стоял вовсе не дядя Юлиус, а Карлсон.
// Он был мокрый как гусь, под ногами у него уже натекла лужа, а в глазах был немой упрек.
import entity.*;
import exceptions.checked.UnmovableException;
import exceptions.unchecked.WrongAgeException;
import location.Kitchen;
import objects.Obj;
import objects.Table;
import utils.*;


public class Main {
    public static void main(String[] args) throws WrongAgeException {
        Posuda posuda = new Posuda("Посуда");
        Table table = new Table("Столик", 40);
        Obj puddle = new Obj("Лужа"){
            public void create(){
                System.out.println("Образовалась " + this.getName());
            }
        };
        table.create();
        Kitchen kitchen = new Kitchen("Кухня");
        Freken frekenbok = new Freken( "Фрекенбок", 40);
        Malysh malysh = new Malysh("Малыш", 10);
        Karlson karlson = new Karlson("Карлсон", 15, Beautifulness.BEAUTY, Dryness.WET);
        Karlson imagkarlson = (Karlson) karlson.copy();
        imagkarlson.setBeautifulness(Beautifulness.DEFAULT);
        imagkarlson.setDryness(Dryness.DRY);
        imagkarlson.setAge(25);
        imagkarlson.getAge();
        frekenbok.setLocation(kitchen);
        malysh.setLocation(kitchen);
        frekenbok.standUp();
        try{frekenbok.move(table);
        }
        catch(UnmovableException e){
            System.out.println("Стол слишком тяжелый");
        }
        frekenbok.wash(posuda);
        frekenbok.look(malysh, Emotes.TREVOZH);
        frekenbok.act(Emotes.NEDOUM);
        Thinkable ref;
        ref = (obj) -> obj + " раздумывает о великом";
        System.out.println(ref.Think(frekenbok));
        frekenbok.say("Скоро дело дойдет до того, что дошкольники станут на Луну летать");
        frekenbok.remember(karlson);
        frekenbok.say(imagkarlson + " этот ваш невоспитанный и толстый мальчишка...");
        malysh.act(Emotes.NEDOVOL);
        karlson.setLocation(kitchen);
        karlson.checkDryness();
        puddle.create();
        karlson.act(Emotes.NEDOVOL);
        karlson.setDiscontent();
    }
}