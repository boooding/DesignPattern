package cs264.ex3.no1;

interface IShoes {
    void show();
}
class NikeShoes implements IShoes {
    @Override
    public void show() {
        System.out.println("NikeShoes");
    }
}
class AntaShoes implements IShoes {
    @Override
    public void show() {
        System.out.println("AntaShoes");
    }
}
class LiNingShoes implements IShoes {
    @Override
    public void show() {
        System.out.println("LiNingShoes");
    }
}
interface IClothing {
    void show();
}
class NikeCloth implements IClothing {
    @Override
    public void show() {
        System.out.println("NikeCloth");
    }
}
class AntaCloth implements IClothing {
    @Override
    public void show() {
        System.out.println("AntaCloth");
    }
}
class LiNingCloth implements IClothing {
    @Override
    public void show() {
        System.out.println("LiNingCloth");
    }
}

public interface AbstractFactory {
    IShoes createShoes();
    IClothing createCloth();
}

class Nike implements AbstractFactory {
    @Override
    public IShoes createShoes()
    {
        return new NikeShoes();
    }
    @Override
    public IClothing createCloth()
    {
        return new NikeCloth();
    }
}
class LiNing implements AbstractFactory {
    @Override
    public IShoes createShoes()
    {
        return new LiNingShoes();
    }
    @Override
    public IClothing createCloth()
    {
        return new LiNingCloth();
    }
}
class Anta implements AbstractFactory {
    @Override
    public IShoes createShoes()
    {
        return new AntaShoes();
    }
    @Override
    public IClothing createCloth()
    {
        return new AntaCloth();
    }
}
