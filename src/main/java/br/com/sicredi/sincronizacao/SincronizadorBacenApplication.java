package br.com.sicredi.sincronizacao;

import br.com.sicredi.sincronizacao.service.SincronizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SincronizadorBacenApplication implements CommandLineRunner {

	@Autowired
	private SincronizacaoService sincronizacaoService;

	public static void main(String[] args) {
		SpringApplication.run(SincronizadorBacenApplication.class, args);
	}

	@Override
	public void run(String... args) {
		if (args.length < 1) {
			System.err.println("Usage: java -jar SincronizadorBacen <input-file>");
			System.exit(1);
		}
		sincronizacaoService.syncAccounts(args[0]);
	}
}
