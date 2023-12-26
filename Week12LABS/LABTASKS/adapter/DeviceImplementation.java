package OOP.Week12LABS.LABTASKS.adapter;

class OldDeviceImpl implements OldDevice{

    @Override
    public void operateOldFunction() {
        System.out.println("Older device.");
    }
}

class NewDeviceImpl implements NewDevice {

    @Override
    public void operateNewFunction() {
        System.out.println("Newer device.");
    }
}

class DeviceAdapter implements NewDevice {
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void operateNewFunction() {
        oldDevice.operateOldFunction();
    }
}

class Main {
    public static void main(String[] args) {
        NewDevice newDevice = new NewDeviceImpl();
        newDevice.operateNewFunction();

        // Integrating the old device into the new interface using the adapter
        OldDevice oldDevice = new OldDeviceImpl();
        NewDevice adapter = new DeviceAdapter(oldDevice);
        adapter.operateNewFunction();
    }
}