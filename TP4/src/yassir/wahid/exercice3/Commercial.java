package yassir.wahid.exercice3;

import java.util.List;

public class Commercial extends Responsable {
    int ventes;

    @Override
    public void setIndiceSalaire(int indiceSalaire) {
        // TODO Auto-generated method stub
        super.setIndiceSalaire(indiceSalaire);
    }

    @Override
    public void setInferieurs_Hierarchical(List<Responsable> inferieurs_Hierarchical) {
        // TODO Auto-generated method stub
        super.setInferieurs_Hierarchical(inferieurs_Hierarchical);
    }

    @Override
    public void setMatricule(String matricule) {
        // TODO Auto-generated method stub
        super.setMatricule(matricule);
    }

    @Override
    public void setNom(String nom) {
        // TODO Auto-generated method stub
        super.setNom(nom);
    }

    public void setVentes(int ventes) {
        this.ventes = ventes;
    }

    @Override
    public int getIndiceSalaire() {
        // TODO Auto-generated method stub
        return super.getIndiceSalaire();
    }

    @Override
    public List<Responsable> getInferieurs_Hierarchical() {
        // TODO Auto-generated method stub
        return super.getInferieurs_Hierarchical();
    }

    @Override
    public String getMatricule() {
        // TODO Auto-generated method stub
        return super.getMatricule();
    }

    @Override
    public String getNom() {
        // TODO Auto-generated method stub
        return super.getNom();
    }

    public int getVentes() {
        return ventes;
    }

	public void Salaire(int salaire) {
		super.setSalaire(
				(super.getIndiceSalaire() + this.ventes / 10) * salaire);
	}

	public void MAJ_Salaire(int salaire) {
		ventes = 0;
		super.setSalaire(
				(super.getIndiceSalaire() + this.ventes / 10) * salaire);
	}

    public Commercial() {
    }

    // init constructor
    public Commercial(int ventes) {
        this.ventes = ventes;
    }
    // constructor with all the fields
    public Commercial(int indiceSalaire, String matricule, String nom, List<Responsable> inferieurs_Hierarchical, int ventes) {
		super.setIndiceSalaire(indiceSalaire);
		super.setInferieurs_Hierarchical(inferieurs_Hierarchical);
		super.setMatricule(matricule);
		super.setNom(nom);
        
        this.ventes = ventes;
    }
}

