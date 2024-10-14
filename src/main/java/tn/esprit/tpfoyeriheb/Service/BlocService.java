package tn.esprit.tpfoyeriheb.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyeriheb.Entity.Bloc;
import tn.esprit.tpfoyeriheb.Reposotories.BlocRepository;

@Getter
@Setter
@Service
@AllArgsConstructor
public class BlocService implements IBlocService {
    BlocRepository blocRepository;

    public Bloc addBloc(Bloc bloc){

        return blocRepository.save(bloc);
    }

    public Bloc updateBloc(Bloc bloc){
        return blocRepository.save(bloc);
    }
    public void deletUser(Bloc bloc){
        blocRepository.delete(bloc);
    }
    public void deleteuserbyid(long id){
        blocRepository.deleteById(id);
    }

    public void deletall(){
        blocRepository.deleteAll();
    }
}
