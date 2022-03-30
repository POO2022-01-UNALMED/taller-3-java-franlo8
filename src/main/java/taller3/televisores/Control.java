package taller3.televisores;

public class Control {
    private TV tv;

    public void enlazar(TV tv){
        this.setTv(tv);
        tv.setControl(this);
    }
    // turnOn, turnOff, canalUp, canalDown,
    //volumenUp, volumenDown y setCanal
    public TV getTv(){
        return this.tv;
    }
    public void setTv(TV tv){
        this.tv = tv;
    }

    public void turnOn(){this.tv.turnOn();}
    public void turnOff(){this.tv.turnOff();}

    public void canalUp(){this.tv.canalUp();}
    public void canalDown(){this.tv.canalDown();}

    public void volumenUp(){this.tv.volumenUp();}
    public void volumenDown(){this.tv.volumenDown();}

    public void setCanal(int canal){this.tv.setCanal(canal);}
}
