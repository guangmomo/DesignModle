package com.xuliwen.dm.memento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.xuliwen.dm.Constants;
import com.xuliwen.dm.R;

public class MementoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memento);
      //  whiteMemento();
        blackMemento();
    }

    /**
     * 白箱模式
     */
    private void whiteMemento(){
        WhiteOriginal original = new WhiteOriginal();
        original.setmState(1);
        WhiteStorage whiteStorage =new WhiteStorage();
        whiteStorage.setWhiteMemento(original.createMemento());
        Log.e(Constants.TAG,"before\n");
        original.print();
        original.setmState(2);
        Log.e(Constants.TAG,"after\n");
        original.print();
        original.restore(whiteStorage.getWhiteMemento());
        Log.e(Constants.TAG,"restore to the original state\n");
        original.print();
    }

    /**
     * 黑箱模式
     */
    private void blackMemento(){
        BlackOriginal staticOriginal=new BlackOriginal();
        staticOriginal.set("1");
        Log.e(Constants.TAG,"before\n");
        staticOriginal.print();
        BlackStorage blackStorage=new BlackStorage();
        blackStorage.setMemento( staticOriginal.saveToMemento());
        staticOriginal.set("2");
        Log.e(Constants.TAG,"after\n");
        staticOriginal.print();
        staticOriginal.restoreFromMemento(blackStorage.getMemento());
        Log.e(Constants.TAG,"restore to the original state\n");
        staticOriginal.print();

    }
}
