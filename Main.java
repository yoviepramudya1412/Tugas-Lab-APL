//Yovie Pramudya Sabri
class Main
{
    public static void main(String args[])
    {
        SuaraBebek suaraBebek = new SuaraBebek();
        Kucing kucing = new SuaraKucing();
  
        Kucing BebekAdapter = new BebekAdapter(suaraBebek);
  
        System.out.print("Suara Bebek           : ");
        suaraBebek.suara();
  
        System.out.print("Suara Kucing          : ");
        kucing.meaw();
  
        System.out.print("Suara kucing terupdate  : ");
        BebekAdapter.meaw();
    }
}