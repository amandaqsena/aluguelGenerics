package aluguelGenerics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import aluguelGenerics.pessoa.*;

public class Historico {
    public Map<Pessoa, List<Aluguel<?>>> historico;

  public Historico() {
    historico = new HashMap<>();
  }

  public void adicionarHistorico(Pessoa pessoa, Aluguel<?> aluguel) {
    List<Aluguel<?>> values;
    if (historico.containsKey(pessoa)) {
      values = historico.get(pessoa);
    } else {
      values = new ArrayList<>();
      historico.put(pessoa, values);
    }
    values.add(aluguel);

  }

  public List<Aluguel<?>> getHistorico(Pessoa pessoa) {
    List<Aluguel<?>> values = historico.get(pessoa);
    return values;
  }

}
