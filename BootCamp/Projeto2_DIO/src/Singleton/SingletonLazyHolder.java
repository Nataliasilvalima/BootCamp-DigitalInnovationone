package Singleton;

/*
Singleton "Lazy Holder"

@see <a href="https://stackoverflow.com/a/24018148">Referencia</a>

*/

public class SingletonLazyHolder {
    
    //Encapsula a instancia do Holder
    private static class InstanciaHolder{
        public static SingletonLazyHolder instancia  = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){          
        return InstanciaHolder.instancia;
    }
}
