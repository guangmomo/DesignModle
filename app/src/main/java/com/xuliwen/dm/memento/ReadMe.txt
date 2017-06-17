1. 应用场景：
需要保存一个对象在某一个时刻的状态或部分状态（使用list实现）

2. 优点：
能够恢复一个对象的状态

   缺点：
如果需要保存的状态比较多，会耗费内存


3. 举例：
 onSaveInstanceState 和 onRestoreInstanceState

 Activity对应Storage
 Bundle  对应Memento
 View    对应Original

4. 写法：
白箱模式
黑箱模式  符合封装性

5. storage的作用
保存的状态是保存在发起人之外的类的，实现了对保存的状态的封装。发起人就不需要对备份进行管理了。
