package summary.designMode.template;

public abstract class Cook {
    public void openFire(){
        System.out.println("开火");
    }
    public void oil(){
        System.out.println("倒油");
    }
    public  abstract void doCook();

    public void close(){
        System.out.println("结束");
    }

    public final void cook(){
        this.openFire();
        this.oil();
        this.doCook();
        this.close();
    }

}
