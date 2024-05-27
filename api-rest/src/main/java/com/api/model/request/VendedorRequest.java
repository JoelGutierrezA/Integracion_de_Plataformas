package com.api.model.request;

import com.api.model.entity.Usuario;
import com.api.model.entity.Vendedor;

public class VendedorRequest {
    private Vendedor vendedor;
    private Integer sucursalId;
    private Usuario usuario;

    // Getters and Setters
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Integer getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Integer sucursalId) {
        this.sucursalId = sucursalId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
