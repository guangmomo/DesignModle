package com.xuliwen.dm.memento;

import android.util.Log;

import com.xuliwen.dm.Constants;

/**
 * Created by xlw on 2017/5/11.
 * 黑箱模式
 * Memento只能在StaticOriginal中被访问到，符合封装性
 */

public class BlackOriginal {
    private String state;
    // The class could also contain additional data that is not part of the
    // state saved in the memento..

    public void set(String state) {
        this.state = state;
    }

    public Memento saveToMemento() {
        return new Memento(this.state);
    }

    public void print(){
        Log.e(Constants.TAG,"备忘录模式： "+state);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
    }

    public static class Memento {
        private final String state;

        private Memento(String stateToSave) {
            state = stateToSave;
        }

        private String getSavedState() {
            return state;
        }
    }
}
