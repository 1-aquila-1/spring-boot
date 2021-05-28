package br.com.aquilla.loja.vo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RelatorioVendaVO {
    private String nomeProduto;
    private Long quantidadeVendida;
    private LocalDate dataUltimaVenda;
}
