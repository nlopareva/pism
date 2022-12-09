import com.company.AbstractFactory.Classes.PreOrder.PreOrderFactory;
import com.company.AbstractFactory.Classes.TestOrder.*;
import com.company.AbstractFactory.Classes.SimpleOrder.SimpleOrderFactory;
import com.company.AbstractFactory.Interfaces.bakery;
import com.company.Builder.Classes.Director;
import com.company.Component.ApplePie;
import com.company.Component.Cake;
import com.company.Component.CompositeBakery;
import com.company.Facade.Facade;
import com.company.Facade.Muffin;
import com.company.Template.Cookie;
import com.company.Template.Pie;
import com.company.Template.Template;
import org.junit.Assert;
import org.junit.Test;
import com.company.AbstractFactory.*;
import java.util.Scanner;

public class RubFactoryTest {

    @Test
    public void FactoryTest(){
        Client app;
        bakery factory;

        System.out.println("1. Test of Abstract Factory ");
        String caketype  = "sdvsdgsdg";
        if (caketype.contains("pre")) {
            factory = new PreOrderFactory();
            app = new Client(factory);
            ////////////////Test////////////////
            Assert.assertEquals("pre",caketype);
        }

        caketype = "fdhfhdfh";
        if(caketype.contains("simple")) {
            factory = new SimpleOrderFactory();
            app = new Client(factory);
            ////////////////Test////////////////
            Assert.assertEquals("simple",caketype);
        }else{
            factory = new TestOrderFactory();
            app = new Client(factory);
        }


    }

    @Test
    public void BuilderTest() {

        System.out.println("2. Test of Builder ");


                 String type = "cake";
                 Assert.assertEquals("cake", type);


                    Director director = new Director();

                    String add = "choco";
                    Assert.assertEquals("choco", add);
                    director.MakeCake();
                    director.CakeDetails(add);


    }

    @Test
    public void ComponentTest(){
        System.out.println("3. Test of Component ");
        ApplePie applePie = new ApplePie(20);
        Cake cake = new Cake(25);

        CompositeBakery compositeBakery = new CompositeBakery();

        int price = compositeBakery.getPrice(applePie.getPricePie(), cake.getPriceCake());
        Assert.assertEquals(35, price);
        compositeBakery.makeOrder();
    }

    @Test
    public void FacadeTest(){
        System.out.println("4. Test of Facade ");
        Facade facade = new Facade();
        com.company.Facade.Cake cake = new com.company.Facade.Cake();
        Muffin muffin = new Muffin();
        int total = facade.totalWaiting(cake.bake(48), muffin.bake(25));
        Assert.assertEquals(70, total);
    }

    @Test
    public void TemplateTest(){
        System.out.println("5. Test of Template ");
        Cookie cookie = new Cookie(20);
        Pie pie = new Pie(25);
        Template template = new Template();
        int total = template.MakeDetailsOrder(cookie.getTime(), pie.getTime());
        Assert.assertEquals(40, total);
    }
}
