// Она умолкла и с таким усердием стала мыть посуду, что брызги летели во все стороны.
// Но вдруг она о чем-то вспомнила,с тревогой поглядела на Малыша и спросила:
// Фрекен Бок никак не могла взять в толк, что Карлсон,  который живет на крыше, - красивый, умный, в меру упитанный мужчина в самом расцвете сил.
// Она считала, что он - ровесник Малыша, его школьный товарищ, самый обыкновенный озорник.
// Что этот озорник почему-то умеет летать, ее не удивляло.
// Она думала, что такой моторчик можно купить в игрушечном магазине, были бы только деньги, и все ворчала по поводу того, что теперь так балуют детей.
// "Скоро дело дойдет до того, что дошкольники станут на Луну летать", - говорила она.
// И вот теперь она вспомнила Карлсона и назвала его "этот невоспитанный, толстый мальчишка"...
// Малышу это совсем не понравилось.

import entity.Freken;
import entity.Karlson;
import entity.Malysh;
import location.Kitchen;
import utils.Emotes;
import utils.Posuda;


public class Main {
    public static void main(String[] args) {
        Posuda posuda = new Posuda("Посуда");
        Kitchen kitchen = new Kitchen("Кухня");
        Freken frekenbok = new Freken( "Фрекенбок", 40);
        Malysh malysh = new Malysh("Малыш", 12);
        Karlson karlson = new Karlson("Карлсон", 15);
        frekenbok.setLocation(kitchen);
        malysh.setLocation(kitchen);
        frekenbok.wash(posuda);
        frekenbok.act(Emotes.NEDOUM);
        frekenbok.think();
        frekenbok.say("Скоро дело дойдет до того, что дошкольники станут на Луну летать");
        frekenbok.remember(karlson);
        frekenbok.say("Карлсон этот ваш невоспитанный и толстый мальчишка...");
        malysh.act(Emotes.NEDOVOL);
    }
}