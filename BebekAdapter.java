//Yovie Pramudya Sabri
class BebekAdapter implements Kucing
{
    Bebek kucing;
    public BebekAdapter(Bebek kucing)
    {
        this.kucing = kucing;
    }

    public void meaw()
    {
        kucing.suara();
    }
}
