public class FalsechocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public FalsechocolateBoiler() {
        empty = true;
        boiled = false;
        System.out.println("Se creo una instancia de FalsechocolateBoiler");
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(isEmpty() && isBoiled()){
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && isBoiled()){
            //bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}