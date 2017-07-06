/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GustavoSantos
 */
public class CarouselController {
    
    private List<Carousel> imagens;
    
    public void CarouselListController(){
    imagens = new ArrayList<Carousel>();
    imagens.add(new Carousel("1","Melhora a escrita!"));
    imagens.add(new Carousel("2","Aguça a imaginação!"));
    imagens.add(new Carousel("3","Desenvolve o vocabulário"));
}

    public List<Carousel> getImagens() {
        return imagens;
    }

    public void setImagens(List<Carousel> imagens) {
        this.imagens = imagens;
    }
    
}
