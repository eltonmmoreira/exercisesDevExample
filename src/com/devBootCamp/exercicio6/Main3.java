package com.devBootCamp.exercicio6;

import com.devBootCamp.exercicio6.crud.CrudService;
import com.devBootCamp.exercicio6.item.Item;
import com.devBootCamp.exercicio6.item.ItemService;
import com.devBootCamp.exercicio6.item.ItemServiceImpl;
import org.w3c.dom.ls.LSInput;

import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        ItemService itemService = new ItemServiceImpl();

        Item item = new Item();
        item.setDescricao("ITemfdsafds");
        itemService.save(item);

        System.out.println();

        Item item1 = new Item();
        item1.setDescricao("74897894791");
        item1 = itemService.save(item1);

        var id = item1.getId();

        System.out.println();

        List<Item> items = itemService.findAll();

        for (Item i : items) {
            System.out.println("Item " + i.getDescricao());
        }

        var i2 = itemService.findById(id);
        System.out.println("Item " + i2.getId());

    }
}
