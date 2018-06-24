
package menu;


public class Menu {  
    
    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        Square square = new Square();
        Rectangle rectangle = new Rectangle ();
        Circle circle = new Circle();
        EqTriangle eqtriangle = new EqTriangle();
        IsTriangle istriangle = new IsTriangle();
        RegPentagon regpentagon = new RegPentagon();
        
        menu.main();
        while(menu.getOptionMain()!= 3){
            if (menu.getOptionMain()== 1){
                menu.sec();
                if (menu.getOptionSec() == 1){
                    square.askSide();
                    square.calcPerimeter();
                    System.out.println("El perimetro del cuadrado cuyo lado mide: " + square.getSide() + " es igual a: " + square.getResult());
                }if (menu.getOptionSec() == 2){
                    rectangle.askLength();
                    rectangle.askWidth();
                    rectangle.calcPerimeter();
                    System.out.println("El perimetro del rectangulo cuyo largo mide: " + rectangle.getLength() + " y su ancho mide:" + rectangle.getWidth() + " es igual a: " + rectangle.getResult());
                }if(menu.getOptionSec() == 3){
                    circle.askRadio();
                    circle.calcPerimeter();
                    System.out.println("El perimetro del circulo cuyo radio mide: " + circle.getRadio() + " es igual a: " + circle.getResult());
                }if (menu.getOptionSec() == 4){
                    eqtriangle.askSide();
                    eqtriangle.calcPerimeter();
                    System.out.println("El perimetro del triangulo equilatero cuyo lado mide: " + eqtriangle.getSide() + " es igual a: " + eqtriangle.getResult());
                }if (menu.getOptionSec() == 5){
                    istriangle.askLongSide();
                    istriangle.askShortSide();
                    istriangle.calcPerimeter();
                    System.out.println("El perimetro del triangulo isosceles cuyo lado mas largo mide: " + istriangle.getLongSide() + " y su lado mas corto mide: " + istriangle.getShortSide() + " es igual a: " + istriangle.getResult());
                }if (menu.getOptionSec() == 6){
                    regpentagon.askSide();
                    regpentagon.calcPerimeter();
                    System.out.println("El perimetro del pentagono regular cuyo lado mide: " + regpentagon.getSide() + " es igual a: " + regpentagon.getResult());
                }
            }else {
                    menu.sec();
                    if (menu.getOptionSec() == 1){
                        square.askSide();
                        square.calcArea();
                        System.out.println("El area del cuadrado cuyo lado mide: " + square.getSide() + " es igual a: " + square.getResult());
                    } if (menu.getOptionSec() == 2){
                        rectangle.askLength();
                        rectangle.askWidth();
                        rectangle.calcArea();
                        System.out.println("El area del rectangulo cuyo largo mide: " + rectangle.getLength() + " y su ancho mide:" + rectangle.getWidth() + " es igual a: " + rectangle.getResult());
                    }if (menu.getOptionSec() == 3){
                        circle.askRadio();
                        circle.calcArea();
                        System.out.println("El area del circulo cuyo radio mide: " + circle.getRadio() + " es igual a: " + circle.getResult());
                    }if (menu.getOptionSec() == 4){
                        eqtriangle.askSide();
                        eqtriangle.calcArea();
                        System.out.println("El area del triangulo equilatero cuyo lado mide: " + eqtriangle.getSide() + " es igual a: " + eqtriangle.getResult());
                    }if (menu.getOptionSec() == 5){
                        istriangle.askBase();
                        istriangle.askHeight();
                        istriangle.calcPerimeter();
                        System.out.println("El area del triangulo isosceles cuya base mide: " + istriangle.getBase() + " y su altura mide: " + istriangle.getHeight() + " es igual a: " + istriangle.getResult());
                    }if (menu.getOptionSec() == 6){
                        regpentagon.askSide();
                        regpentagon.askApotem();
                        regpentagon.calcArea();
                    System.out.println("El area del pentagono regular cuyo lado mide: " + regpentagon.getSide() + " y su apotema mide: "+ regpentagon.getApotem() + " es igual a: " + regpentagon.getResult());
                    }else{
                        break;
                    }
            }
            menu.otherOp();
            if(menu.getOptionOhter() == 1){
                menu.main();
            }else{
                break;
            }        
        }
    }
}




