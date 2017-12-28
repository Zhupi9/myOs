package myos.manager.memory;

/**
 * Created by lindanpeng on 2017/12/24.
 */
public class PCB {
    public static final int STATUS_WAIT=0;//就绪
    public static final int STATUS_RUN=1;//运行
    public static final int STATUS_BLOCK=2;//阻塞
    public static final int STATUS_HANG_OUT=3;//闲逛
    private static  int idGenerator =1;
    //进程唯一标识符
    private int PID;
    //状态
    private int status;
    //优先级
    private int priority;
    //程序计数器，相对于memStart
    private int counter;
    //寄存器数据
    private int AX;
    private int BX;
    private int CX;
    private int DX;
    //指向进程的程序和数据在内存中的首地址
    private int memStart;
    //指向进程的程序和数据在内存中的尾地址
    private int memEnd;
    //事件
    private int event;
    public PCB(){
        idGenerator++;
        PID=idGenerator;
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }


    public int getAX() {
        return AX;
    }

    public void setAX(int AX) {
        this.AX = AX;
    }

    public int getMemStart() {
        return memStart;
    }

    public void setMemStart(int memStart) {
        this.memStart = memStart;
    }

    public int getMemEnd() {
        return memEnd;
    }

    public void setMemEnd(int memEnd) {
        this.memEnd = memEnd;
    }

    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }

    public int getBX() {
        return BX;
    }

    public void setBX(int BX) {
        this.BX = BX;
    }

    public int getCX() {
        return CX;
    }

    public void setCX(int CX) {
        this.CX = CX;
    }

    public int getDX() {
        return DX;
    }

    public void setDX(int DX) {
        this.DX = DX;
    }
}
