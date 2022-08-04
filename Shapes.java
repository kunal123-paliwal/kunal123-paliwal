 class Shape{
    public void print_shape(){
        System.out.println("This is a shape!");
    }
}
    class rectangle extends Shape{
        public void print_rect(){
            System.out.println("This is rectangle! ");
        }
    }
    class circle extends Shape{
        public void print_circle(){
            
        }
    }
    class square extends rectangle{
        public  void print_square(){
            System.out.println("Square is a rectangle");
        }
    }
    
   public class Shapes{
        public static void main(String[] args){
            square sq = new square();
            sq.print_shape();
            sq.print_rect();
        }
    }

