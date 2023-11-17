package br.edu.imepac.observerpattern.observer;

import br.edu.imepac.observerpattern.model.Estoque;

public interface Observer {
    public void update(Estoque estoque);
}
