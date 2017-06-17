外观模式：
1. 写一个Computer对CPU,Memory，Disk做封装，使得用户启动，关闭电脑的时候只需要操作Computer，
而不需要对CPU,Memory，Disk一一操作。
2. 将关闭和开启都封装在Computer中，当关闭和开启发生变化时，只需修改Computer

优点：
简化客户端的调用

缺点：
当增加一个Music类时，需要修改Computer类，增加Music的关闭和开启操作，违反开闭原则