package com.xuliwen.dm.memento;

/**
 * Created by xlw on 2017/5/11.
 */

public class BlackStorage {
    public BlackOriginal.Memento getMemento() {
        return memento;
    }

    public void setMemento(BlackOriginal.Memento memento) {
        this.memento = memento;
    }

    private BlackOriginal.Memento memento;

}
