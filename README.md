# Gestor de usuarios – Práctica Tema 2: Paneles y Layouts como profesionales

## 1. Wireframe (boceto inicial)
Diseñé en papel la ventana principal con las siguientes zonas:

- **Header (NORTH):** título + icono.
- **Lateral (WEST):** 5 botones de navegación.
- **Centro (CENTER):** formulario de datos.
- **Derecha (EAST):** previsualización en pestañas.
- **Inferior (SOUTH):** barra de botones de acción.

*(Adjuntar aquí foto/escaneo del boceto o imagen hecha con Draw.io/Figma)*

---

## 2. Árbol de contenedores y layouts

```text
JFrame (BorderLayout)
 ├─ NORTH: headerPanel (FlowLayout, LEFT)
 │    ├─ JLabel (icono + "Gestor de usuarios")
 │    └─ JSeparator
 │
 ├─ WEST: navPanel (GridLayout 5x1, vgap=5)
 │    ├─ JButton "Dashboard"
 │    ├─ JButton "Usuarios"
 │    ├─ JButton "Informes"
 │    ├─ JButton "Ajustes"
 │    └─ JButton "Ayuda"
 │
 ├─ CENTER: formPanel (GridBagLayout)
 │    Fila 0: JLabel "Nombre"   | JTextField
 │    Fila 1: JLabel "Email"    | JTextField
 │    Fila 2: JLabel "Rol"      | JComboBox (Admin/Editor/Invitado)
 │    Fila 3: JLabel "Activo"   | JCheckBox
 │    Fila 4: JLabel "Notas"    | JScrollPane → JTextArea
 │
 ├─ EAST: previewPanel (BorderLayout)
 │    └─ JTabbedPane (CENTER)
 │        ├─ Tab "Resumen": JTextArea (readOnly)
 │        └─ Tab "Logs": JTextArea o JList
 │
 └─ SOUTH: buttonBar (FlowLayout, RIGHT)
      ├─ JButton "Cancelar"
      ├─ JButton "Limpiar"
      └─ JButton "Guardar" (default)

```text
## 3. Propiedades clave de layout
Zona	Layout	Propiedades destacadas
Header	FlowLayout	Alignment = LEFT, fuente Bold 18, icono opcional
Navegación	GridLayout	5x1, vgap=5, SameSizeHorizontally = true
Formulario	GridBagLayout	insets=5, anchor=WEST en etiquetas, fill=HORIZONTAL en campos, weightx=1 (campos), weighty=1 en "Notas"
Previsualiz.	BorderLayout	JTabbedPane con 2 tabs, preferredWidth ≈ 260px
Botonera	FlowLayout	Alignment = RIGHT, SameSizeHorizontally = true

## 4. Comportamiento al redimensionar
El CENTER (formulario) y la caja de Notas crecen correctamente.

El EAST (previsualización) mantiene un ancho estable.

La botonera inferior se alinea siempre a la derecha.

## 5. JDialog de confirmación
Ventana modal DialogConfirmacion.

Contiene JLabel (“¿Guardar cambios?”) y botones Aceptar / Cancelar.

Se abre al pulsar Guardar en la ventana principal con:

java
Copiar código
dialog.setModal(true);
dialog.pack();
dialog.setVisible(true);
## 6. Capturas
(Adjuntar aquí las imágenes: vista general, redimensionada, pestañas del JTabbedPane y el JDialog modal abierto).

## 7. Conclusión
Se han practicado BorderLayout, FlowLayout, GridLayout y GridBagLayout en un mismo proyecto.

Se controlan propiedades de distribución: insets, weightx/weighty, fill, anchor, alignment.

La interfaz responde bien al redimensionado y mantiene coherencia visual.
