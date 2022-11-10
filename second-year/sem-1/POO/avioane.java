class Plane{
    protected String planeID;
    protected int TotalEnginePower;

    public Plane(){
    }
    public String getPlaneID(){
        return planeID;
    }

    public int getTotalEnginePower(){
        return TotalEnginePower;
    }

    public void takeOFF(){
        System.out.println(this.getPlaneID() +"_"+ this.getTotalEnginePower()+" - Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - Retracting gear - Takeoff complete \n" );
    }

    public void fly(){
        System.out.println(this.getPlaneID() +"_"+ this.getTotalEnginePower()+" - Flying \n");
    }

    public void land(){
        System.out.println(this.getPlaneID() +"_"+ this.getTotalEnginePower() +" - Initiating landing procedure - Enabling airbrakes -Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete \n");
    }

}

class PassagerPlane extends Plane{
    protected int maxPassengers;
    public PassagerPlane(){

    }
    public int getMaxPassengers(){
        return maxPassengers;
    }
}

class Boeing extends PassagerPlane{
    private static int id = 0;
    public Boeing(int power, int maxPassengers){
        planeID  = "B#"+id;
        super.maxPassengers = maxPassengers;
        TotalEnginePower = power;
        id++;
    }
}

class Concorde extends PassagerPlane{
    private static int id = 0;

    public Concorde(int power, int maxPassengers){
        planeID  = "C#"+id;
        super.maxPassengers = maxPassengers;
        TotalEnginePower = power;
        id++;
    }

    public void goSuperSonic(){
        System.out.println(this.getPlaneID() +"_"+ this.getTotalEnginePower()+ " SuperSonic mode avtivated \n");
    }

    public void goSubSonic(){
        System.out.println(this.getPlaneID() +"_"+ this.getTotalEnginePower()+ " SuperSonic mode deavtivated \n");
    }
}

class FightPlane extends Plane{
   public FightPlane(){

   }
   public void launchMissile(){
        System.out.println(this.planeID + "_" + this.getTotalEnginePower() + " - Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete \n");
   }
}

class Mig extends FightPlane{
    private static int id = 0;

    public Mig(int TotalEnginePower){
        planeID  = "M#"+id;
        super.TotalEnginePower = TotalEnginePower;
        id++;
    }

    public void highSpeedGeometry(){
        System.out.println(this.planeID + "_" + this.getTotalEnginePower() + " - High speed geometry selected \n");
    }

    public void normalGeometry(){
        System.out.println(this.planeID + "_" + this.getTotalEnginePower() + " - Normal geometry selected \n");
    }
}

class TomCat extends FightPlane{
    private static int id = 0;

    public TomCat(int TotalEnginePower){
        planeID  = "TC#"+id;
        super.TotalEnginePower = TotalEnginePower;
        id++;
    }

    public void refuel(){
        System.out.println(this.planeID + "_" + this.getTotalEnginePower() + " PlaneID Value - Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete \n");
    }
}
class Main{
    public static void main(String[] args){
        Plane plane1 = new Boeing(780,1000);
        Plane plane2 = new Concorde(1000,400);
        Plane plane3 = new Mig(1000);
        Plane plane4 = new TomCat(1000);
        Plane plane5 = new TomCat(1200);

        plane1.takeOFF();
        plane1.fly();
        plane1.land();
        System.out.println("plane1:" + ((Boeing)plane1).getMaxPassengers()+"\n");

        plane2.fly();
        ((Concorde)plane2).goSuperSonic();
        ((Concorde)plane2).goSubSonic();

        plane3.fly();
        ((Mig)plane3).launchMissile();
        ((Mig)plane3).highSpeedGeometry();
        ((Mig)plane3).normalGeometry();

        plane4.fly();
        ((TomCat)plane4).launchMissile();
        ((TomCat)plane4).refuel();

        plane5.fly();

        //plane1.getSuperSonic();
    }
}
