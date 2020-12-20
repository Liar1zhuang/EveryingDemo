package listener;

public class EventSource {

    private IEventListener mEventListener;

    // 注册监听器
    public void setEventListener(IEventListener arg) {
        mEventListener = arg;
    }

    // 触发事件
    public void EventHappened() {
        mEventListener.onclickButton();
    }

}
