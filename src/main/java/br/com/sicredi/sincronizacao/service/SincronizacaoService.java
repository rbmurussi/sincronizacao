package br.com.sicredi.sincronizacao.service;

import br.com.sicredi.sincronizacao.timer.MeasuredExecutionTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SincronizacaoService {

  private final BancoCentralService bancoCentralService;

  @MeasuredExecutionTime
  public void syncAccounts(String inputFile) {

    //TODO: Implementar a sincronização aqui
  }

}
