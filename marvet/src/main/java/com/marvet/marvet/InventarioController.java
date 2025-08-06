package com.marvet.marvet;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.marvet.marvet.Clases.Productos;

@Controller
public class InventarioController {

    // Método para mostrar el inventario de productos
    // Este es un ejemplo de como los productos se visualizarían en la vista
    // En un caso real, los productos vendrían de una base de datos
    @GetMapping("/inventario")
    public String verInventario(Model model) {
        List<Productos> productos = List.of(
                new Productos("Collar antipulgas", "Accesorios", 25, 12.99),
                new Productos("Alimento para gatos", "Alimentos", 40, 8.50),
                new Productos("Shampoo medicado", "Higiene", 15, 14.00)
        );
        model.addAttribute("productos", productos);
        return "inventario";
    }

    @GetMapping("/inventario/agregar")
    public String agregarProducto() {
        return "agregarProducto"; 
    }
}