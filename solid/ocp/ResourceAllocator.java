package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource) {
        int resourceId;
        try {
            resource.setResourceId(resource.findFreeSlot());
            resource.markSlotBusy(resource.getResourceId());
        }catch (Exception e){
            System.out.println("ERROR: Attempted to allocate invalid resource");
            resourceId = INVALID_RESOURCE_ID;
        }
        return resource.getResourceId();
    }

    public void free(Resource resource) {
        try {
            resource.markSlotFree(resource.getResourceId());
        }catch (Exception e){
            System.out.println("ERROR: attempted to free invalid resource");
        }
    }


}
