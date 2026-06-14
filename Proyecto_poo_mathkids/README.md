Proyecto_poo_mathkids
=====================

Resumen
-------
Proyecto Java creado con NetBeans. Incluye formularios (.form) generados por el GUI builder y código fuente (.java). Este README explica cómo abrir el proyecto exactamente como lo ves, cómo colaborar y buenas prácticas.

Requisitos
---------
- Java JDK 17 (recomendado)
- Apache Ant (opcional, NetBeans trae soporte integrado)
- NetBeans IDE 28 (recomendado) o versión compatible con formularios Matisse
- Git y una cuenta de GitHub

Clonar el repositorio
---------------------
Usar HTTPS o SSH según tu configuración:

- HTTPS:
  git clone https://github.com/Agus44k/Proyecto_poo_mathkids.git

- SSH (si tienes clave configurada):
  git clone git@github.com:Agus44k/Proyecto_poo_mathkids.git

Abrir el proyecto en NetBeans
----------------------------
1. Abrir NetBeans.
2. File → Open Project.
3. Seleccionar la carpeta donde clonaste (debe contener el folder proyecto_poo_mathkids con build.xml y nbproject).
4. NetBeans detectará y cargará el proyecto. Los archivos .form se abren con el editor visual (GUI builder).
5. Para ejecutar: clic derecho en el proyecto → Run.

Notas sobre configuraciones locales
----------------------------------
- nbproject/private/ está ignorado: contiene configuraciones locales (no subir).
- Si modificaste settings locales, compártelos por escrito con el equipo (no subir archivos privados).
- Si ves inconsistencias después de un reescrito de historial, vuelve a clonar el repo completamente.

Flujo de trabajo recomendado (colaboración)
------------------------------------------
1. Crear rama para la tarea:
   git checkout -b feat/mi-cambio
2. Hacer cambios y commitear frecuentemente:
   git add .
   git commit -m "Descripción corta de cambio"
3. Subir la rama:
   git push origin feat/mi-cambio
4. Abrir Pull Request en GitHub y pedir revisión.
5. Una vez aprobado, mergea a main (preferible a través de PR).

Permisos y acceso
-----------------
- Acepta la invitación de colaborador que recibiste por email/notifications para obtener acceso.
- Con permiso "write" puedes push a ramas y abrir PR. Con "admin" puedes cambiar settings.

Cómo mantener tu copia actualizada
---------------------------------
- Para recibir cambios del equipo:
  git checkout main
  git pull origin main

Si el historial fue reescrito (p. ej. para eliminar archivos sensibles)
-------------------------------------------------------------------
- Recomendado: volver a clonar el repositorio para evitar conflictos:
  git clone https://github.com/Agus44k/Proyecto_poo_mathkids.git

Buenas prácticas
----------------
- No subir nbproject/private ni archivos con credenciales.
- Mensajes de commit claros: "feat", "fix", "docs".
- Usar ramas por feature/task y Pull Requests para revisión.

Contacto
--------
Si tienes problemas para abrir el proyecto en NetBeans o con Git, comenta en GitHub Issues o contacta a Agus44k en GitHub.

