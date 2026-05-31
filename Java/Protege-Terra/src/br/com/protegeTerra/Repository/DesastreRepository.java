package br.com.protegeTerra.Repository;
import br.com.protegeTerra.Model.Desastre;
import java.util.ArrayList;
import java.util.List;

public class DesastreRepository {

    private List<Desastre> desastres = new ArrayList<>();

    public void salvar(Desastre desastre){
        desastres.add(desastre);
    }

    public List<Desastre> listar(){
        return desastres;
    }
}
