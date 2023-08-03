package solid.live.ocp;

public interface Resource {

    default void markSlotFree(int resourceId){} ;

    default void markSlotBusy(int resourceId) {}

    default int findFreeSlot() {
        return 0;
    }


    default int getResourceId(){return 0;};

    default void setResourceId(int resourceId){};


}
 class TimeSlot implements Resource{
    public int resourceID;

    TimeSlot(){}
     public void setResourceID(int resourceID){
         this.resourceID=resourceID;
     }
     public int getResourceID(){
         return this.resourceID;
     }

     public void markSlotFree(int resourceId){} ;

     public void markSlotBusy(int resourceId) {}

     public int findFreeSlot() {
         return 0;
     }
 }

class SpaceSlot implements Resource{
    public int resourceID;
    SpaceSlot(){
    }
    public void setResourceID(int resourceID){
        this.resourceID=resourceID;
    }
    public int getResourceID(){
        return this.resourceID;
    }
    public void markSlotFree(int resourceId){} ;

    public void markSlotBusy(int resourceId) {}

    public int findFreeSlot() {
        return 0;
    }
}