public class buttonTester {

    public static void main(String[] args) {


        class button{

            public String label;
            public String color;

            public void setColor(){
                System.out.println("Button color is now ");

            }

            public void setLabel(){
                System.out.println("Label will be printed as ");

            }

            public void dePress(){
                System.out.println("Label will now activate");
            }

            public void undepress(){
                System.out.println("label will now deactivate");
            }
        }
    }
}
