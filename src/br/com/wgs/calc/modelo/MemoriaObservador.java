package br.com.wgs.calc.modelo;
@FunctionalInterface
public interface MemoriaObservador {
    void valorAlterado (String novoValor);
}
