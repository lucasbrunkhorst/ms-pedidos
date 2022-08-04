package com.lucasbrunkhorst.mspedidos.dto;

import com.lucasbrunkhorst.mspedidos.model.Status;

public class StatusDto {

    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public StatusDto(Status status) {
        this.status = status;
    }
}
