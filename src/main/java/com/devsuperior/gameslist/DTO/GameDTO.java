package com.devsuperior.gameslist.DTO;

import com.devsuperior.gameslist.entities.Game;

public class GameDTO {

    private Long codigo;
    private String titulo;
    private Integer ano;
    private String img_url;
    private String descricaoCurta;

    public GameDTO(Game game) {
        codigo = game.getCodigo();
        titulo = game.getTitulo();
        ano = game.getAno();
        img_url = game.getImgUrl();
        descricaoCurta = game.getDescricaoCurta();
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getImg_url() {
        return img_url;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }
}
