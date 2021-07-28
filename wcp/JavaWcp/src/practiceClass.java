class ctest1{
  public static void main(String args[]){
    Television tv1 = new Television();
//Televisionクラスで使用されるオブジェクト作成（１）mainなので最初
    tv1.setChannel(1);
//SetChannelメソッドに1を送信（２）
    tv1.dispChannel();
//    dispChannelメソッドに空のオブジェクト送信。（５）
  }
}

class Television{
  int channelNo;
//Televionに変数設定（３）
  void setChannel(int newChannelNo){
    channelNo = newChannelNo;
//    （２）で送ったモノを受信。（４）
  }

  void dispChannel(){
    System.out.println("現在のチャンネルは " + channelNo + " です");
  }
}