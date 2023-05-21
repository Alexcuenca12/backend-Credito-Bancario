INSERT INTO bd_creditobancario.rol (rolid, rol_descripcion, rol_estado, rol_nombre) VALUES
(1, "Administrador", 1, "Administrador"),
(2, "Ejecutivo", 1, "Ejecutivo"),
(3, "Assesor", 1, "Assesor"),
(4, "Usuario", 1, "Usuario");
/** PROVINCIAS **/
		INSERT INTO bd_creditobancario.provincia (prov_id, prov_cod, prov_nombre) VALUES
        (1,1, 'AZUAY'),
        (2,2, 'BOLIVAR'),
        (3,3, 'CAÑAR'),
        (4,4, 'CARCHI'),
        (5,5, 'COTOPAXI'),
        (6,6, 'CHIMBORAZO'),
        (7,7, 'EL ORO'),
        (8,8, 'ESMERALDAS'),
        (9,9, 'GUAYAS'),
        (10,10, 'IMBABURA'),
        (11,11, 'LOJA'),
        (12,12, 'LOS RIOS'),
        (13,13, 'MANABI'),
        (14,14, 'MORONA SANTIAGO'),
        (15,15, 'NAPO'),
        (16,16, 'PASTAZA'),
        (17,17, 'PICHINCHA'),
        (18,18, 'TUNGURAHUA'),
        (19,19, 'ZAMORA CHINCHIPE'),
        (20,20, 'GALAPAGOS'),
        (21,21, 'SUCUMBIOS'),
        (22,22, 'ORELLANA'),
        (23,23, 'SANTO DOMINGO DE LOS TSACHILAS'),
        (24,24, 'SANTA ELENA');
/********************************************************************************************************************/
/********************************************************************************************************************/
/** CANTONES **/
        /*AZUAY*/
        INSERT INTO bd_creditobancario.canton (cantid, prov_id, cant_cod, cant_nombre) VALUES
        (1, 1, 01, 'CUENCA'),
        (2, 1, 02, 'GIRON'),
        (3, 1, 03, 'GUALACEO'),
        (4, 1, 04, 'NABON'),
        (5, 1, 05, 'PAUTE'),
        (6, 1, 06, 'PUCARA'),
        (7, 1, 07, 'SAN FERNANDO'),
        (8, 1, 08, 'SANTA ISABEL'),
        (9, 1, 09, 'SIGSIG'),
        (10, 1, 10, 'OÑA'),
        (11, 1, 11, 'CHORDELEG'),
        (12, 1, 12, 'EL PAN'),
        (13, 1, 13, 'SEVILLA DE ORO'),
        (14, 1, 14, 'GUACHAPALA'),
        (15, 1, 15, 'CAMILO PONCE ENRIQUEZ'),

        /*BOLIVAR*/
        (16, 2, 01, 'GUARANDA'),
        (17, 2, 02, 'CHILLANES'),
        (18, 2, 03, 'CHIMBO'),
        (19, 2, 04, 'ECHEANDIA'),
        (20, 2, 05, 'SAN MIGUEL'),
        (21, 2, 06, 'CALUMA'),
        (22, 2, 07, 'LAS NAVES'),

        /*CAÑAR*/
        (23, 3, 01, 'AZOGUES'),
        (24, 3, 02, 'BIBLIAN'),
        (25, 3, 03, 'CAÑAR'),
        (26, 3, 04, 'LA TRONCAL'),
        (27, 3, 05, 'EL TAMBO'),
        (28, 3, 06, 'DELEG'),
        (29, 3, 07, 'SUSCAL'),

        /*CARCHI*/
        (30, 4, 01, 'TULCAN'),
        (31, 4, 02, 'BOLIVAR'),
        (32, 4, 03, 'ESPEJO'),
        (33, 4, 04, 'MIRA'),
        (34, 4, 05, 'MONTUFAR'),
        (35, 4, 06, 'SAN PEDRO DE HUACA'),

        /*COTOPAXI*/
        (36, 5, 01, 'LATACUNGA'),
        (37, 5, 02, 'LA MANA'),
        (38, 5, 03, 'PANGUA'),
        (39, 5, 04, 'PUJILI'),
        (40, 5, 05, 'SALCEDO'),
        (41, 5, 06, 'SAQUISILI'),
        (42, 5, 07, 'SIGCHOS'),

        /*CHIMBORAZO*/
        (43, 6, 01, 'RIOBAMBA'),
        (44, 6, 02, 'ALAUSI'),
        (45, 6, 03, 'COLTA'),
        (46, 6, 04, 'CHAMBO'),
        (47, 6, 05, 'CHUNCHI'),
        (48, 6, 06, 'GUAMOTE'),
        (49, 6, 07, 'GUANO'),
        (50, 6, 08, 'PALLATANGA'),
        (51, 6, 09, 'PENIPE'),
        (52, 6, 10, 'CUMANDA'),

        /*EL ORO*/
        (53, 7, 01, 'MACHALA'),
        (54, 7, 02, 'ARENILLAS'),
        (55, 7, 03, 'ATAHUALPA'),
        (56, 7, 04, 'BALSAS'),
        (57, 7, 05, 'CHILLA'),
        (58, 7, 06, 'EL GUABO'),
        (59, 7, 07, 'HUAQUILLAS'),
        (60, 7, 08, 'MARCABELI'),
        (61, 7, 09, 'PASAJE'),
        (62, 7, 10, 'PIÑAS'),
        (63, 7, 11, 'PORTOVELO'),
        (64, 7, 12, 'SANTA ROSA'),
        (65, 7, 13, 'ZARUMA'),
        (66, 7, 14, 'LAS LAJAS'),

        /*ESMERALDAS* */
        (67, 8, 01, 'ESMERALDAS'),
        (68, 8, 02, 'ELOY ALFARO'),
        (69, 8, 03, 'MUISNE'),
        (70, 8, 04, 'QUININDE'),
        (71, 8, 05, 'SAN LORENZO'),
        (72, 8, 06, 'ATACAMES'),
        (73, 8, 07, 'RIOVERDE'),

        /*GUAYAS*/
        (74, 9, 01, 'GUAYAQUIL'),
        (75, 9, 02, 'ALFREDO BAQUERIZO MORENO'),
        (76, 9, 03, 'BALAO'),
        (77, 9, 04, 'BALZAR'),
        (78, 9, 05, 'COLIMES'),
        (79, 9, 06, 'DAULE'),
        (80, 9, 07, 'DURAN'),
        (81, 9, 08, 'EL EMPALME'),
        (82, 9, 09, 'EL TRIUNFO'),
        (83, 9, 10, 'MILAGRO'),
        (84, 9, 11, 'NARANJAL'),
        (85, 9, 12, 'NARANJITO'),
        (86, 9, 13, 'PALESTINA'),
        (87, 9, 14, 'PEDRO CARBO'),
        (88, 9, 16, 'SAMBORONDON'),
        (89, 9, 18, 'SANTA LUCIA'),
        (90, 9, 19, 'SALITRE'),
        (91, 9, 20, 'SAN JACINTO DE YAGUACHI'),
        (92, 9, 21, 'PLAYAS'),
        (93, 9, 22, 'SIMON BOLIVAR'),
        (94, 9, 23, 'CORONEL MARCELINO MARIDUEÑA'),
        (95, 9, 24, 'LOMAS DE SARGENTILLO'),
        (96, 9, 25, 'NOBOL'),
        (97, 9, 27, 'GENERAL ANTONIO ELIZALDE'),
        (98, 9, 28, 'ISIDRO AYORA'),

        /*IMBABURA */
        (99, 10, 01, 'IBARRA'),
        (100, 10, 02, 'ANTONIO ANTE'),
        (101, 10, 03, 'COTACACHI'),
        (102, 10, 04, 'OTAVALO'),
        (103, 10, 05, 'PIMAMPIRO'),
        (104, 10, 06, 'SAN MIGUEL DE URCUQUI'),

        /*LOJA*/
        (105, 11, 01, 'LOJA'),
        (106, 11, 02, 'CALVAS'),
        (107, 11, 03, 'CATAMAYO'),
        (108, 11, 04, 'CELICA'),
        (109, 11, 05, 'CHAGUARPAMBA'),
        (110, 11, 06, 'ESPINDOLA'),
        (111, 11, 07, 'GONZANAMA'),
        (112, 11, 08, 'MACARA'),
        (113, 11, 09, 'PALTAS'),
        (114, 11, 10, 'PUYANGO'),
        (115, 11, 11, 'SARAGURO'),
        (116, 11, 12, 'SOZORANGA'),
        (117, 11, 13, 'ZAPOTILLO'),
        (118, 11, 14, 'PINDAL'),
        (119, 11, 15, 'QUILANGA'),
        (120, 11, 16, 'OLMEDO'),

        /*LOS RIOS*/
        (121, 12, 01, 'BABAHOYO'),
        (122, 12, 02, 'BABA'),
        (123, 12, 03, 'MONTALVO'),
        (124, 12, 04, 'PUEBLOVIEJO'),
        (125, 12, 05, 'QUEVEDO'),
        (126, 12, 06, 'URDANETA'),
        (127, 12, 07, 'VENTANAS'),
        (128, 12, 08, 'VINCES'),
        (129, 12, 09, 'PALENQUE'),
        (130, 12, 10, 'BUENA FE'),
        (131, 12, 11, 'VALENCIA'),
        (132, 12, 12, 'MOCACHE'),
        (133, 12, 13, 'QUINSALOMA'),

        /*MANABI*/
        (134, 13, 01, 'PORTOVIEJO'),
        (135, 13, 02, 'BOLIVAR'),
        (136, 13, 03, 'CHONE'),
        (137, 13, 04, 'EL CARMEN'),
        (138, 13, 05, 'FLAVIO ALFARO'),
        (139, 13, 06, 'JIPIJAPA'),
        (140, 13, 07, 'JUNIN'),
        (141, 13, 08, 'MANTA'),
        (142, 13, 09, 'MONTECRISTI'),
        (143, 13, 10, 'PAJAN'),
        (144, 13, 11, 'PICHINCHA'),
        (145, 13, 12, 'ROCAFUERTE'),
        (146, 13, 13, 'SANTA ANA'),
        (147, 13, 14, 'SUCRE'),
        (148, 13, 15, 'TOSAGUA'),
        (149, 13, 16, '24 DE MAYO'),
        (150, 13, 17, 'PEDERNALES'),
        (151, 13, 18, 'OLMEDO'),
        (152, 13, 19, 'PUERTO LOPEZ'),
        (153, 13, 20, 'JAMA'),
        (154, 13, 21, 'JARAMIJO'),
        (155, 13, 22, 'SAN VICENTE'),

        /*MORONA SANTIAGO*/
        (156, 14, 01, 'MORONA'),
        (157, 14, 02, 'GUALAQUIZA'),
        (158, 14, 03, 'LIMON INDANZA'),
        (159, 14, 04, 'PALORA'),
        (160, 14, 05, 'SANTIAGO'),
        (161, 14, 06, 'SUCUA'),
        (162, 14, 07, 'HUAMBOYA'),
        (163, 14, 08, 'SAN JUAN BOSCO'),
        (164, 14, 09, 'TAISHA'),
        (165, 14, 10, 'LOGROÑO'),
        (166, 14, 11, 'PABLO SEXTO'),
        (167, 14, 12, 'TIWINTZA'),

        /*NAPO*/
        (168, 15, 01, 'TENA'),
        (169, 15, 03, 'ARCHIDONA'),
        (170, 15, 04, 'EL CHACO'),
        (171, 15, 07, 'QUIJOS'),
        (172, 15, 09, 'CARLOS JULIO AROSEMENA TOLA'),

        /*PASTAZA*/
        (173, 16, 01, 'PASTAZA'),
        (174, 16, 02, 'MERA'),
        (175, 16, 03, 'SANTA CLARA'),
        (176, 16, 04, 'ARAJUNO'),

        /*PICHINCHA*/
        (177, 17, 01, 'DISTRITO METROPOLITANO DE QUITO'),
        (178, 17, 02, 'CAYAMBE'),
        (179, 17, 03, 'MEJIA'),
        (180, 17, 04, 'PEDRO MONCAYO'),
        (181, 17, 05, 'RUMIÑAHUI'),
        (182, 17, 06, 'SAN MIGUEL DE LOS BANCOS'),
        (183, 17, 07, 'PEDRO VICENTE MALDONADO'),
        (184, 17, 08, 'PUERTO QUITO'),

        /*TUNGURAHUA*/
        (185, 18, 01, 'AMBATO'),
        (186, 18, 02, 'BAÑOS DE AGUA SANTA'),
        (187, 18, 03, 'CEVALLOS'),
        (188, 18, 04, 'MOCHA'),
        (189, 18, 05, 'PATATE'),
        (190, 18, 06, 'QUERO'),
        (191, 18, 07, 'SAN PEDRO DE PELILEO'),
        (192, 18, 08, 'SANTIAGO DE PILLARO'),
        (193, 18, 09, 'TISALEO'),

        /*ZAMORA CHINCHIPE*/
        (194, 19, 01, 'ZAMORA'),
        (195, 19, 02, 'CHINCHIPE'),
        (196, 19, 03, 'NANGARITZA'),
        (197, 19, 04, 'YACUAMBI'),
        (198, 19, 05, 'YANTZAZA'),
        (199, 19, 06, 'EL PANGUI'),
        (200, 19, 07, 'CENTINELA DEL CONDOR'),
        (201, 19, 08, 'PALANDA'),
        (202, 19, 09, 'PAQUISHA'),

        /*GALAPAGOS*/
        (203, 20, 01, 'SAN CRISTOBAL'),
        (204, 20, 02, 'ISABELA'),
        (205, 20, 03, 'SANTA CRUZ'),

        /*SUCUMBIOS*/
        (206, 21, 01, 'LAGO AGRIO'),
        (207, 21, 02, 'GONZALO PIZARRO'),
        (208, 21, 03, 'PUTUMAYO'),
        (209, 21, 04, 'SHUSHUFINDI'),
        (210, 21, 05, 'SUCUMBIOS'),
        (211, 21, 06, 'CASCALES'),
        (212, 21, 07, 'CUYABENO'),

        /*ORELLANA*/
        (213, 22, 01, 'ORELLANA'),
        (214, 22, 02, 'AGUARICO'),
        (215, 22, 03, 'LA JOYA DE LOS SACHAS'),
        (216, 22, 04, 'LORETO'),

        /*SANTO DOMINGO*/
        (217, 23, 01, 'SANTO DOMINGO'),
        (218, 23, 02, 'LA CONCORDIA'),

        /*SANTA ELENA*/
        (219, 24, 01, 'SANTA ELENA'),
        (220, 24, 02, 'LA LIBERTAD'),
        (221, 24, 03, 'SALINAS');
/********************************************************************************************************************/
/********************************************************************************************************************/

/** PARROQUIAS **/
INSERT INTO bd_creditobancario.parroquia(parrid, parr_cod, parr_nombre, cantid) VALUES
/** AZUAY **/
-- //CUENCA
        (1, 15,'HERMANO MIGUEL',1),
        (2, 51,'BAÑOS',1),
        (3, 52,'CUMBE',1),
        (4, 53,'CHAUCHA',1),
        (5, 54,'CHECA (JIDCAY)',1),
        (6, 55,'CHIQUITAD',1),
        (7, 56,'LLACAO',1),
        (8, 57,'MOLLETURO',1),
        (9, 58,'NULTI',1),
        (10, 59,'OCTAVIO CORDERO PALACIOS (STA. ROSA)',1),
        (11, 60,'PACCHA',1),
        (12, 61,'QUIGEO',1),
        (13, 62,'RICAURTE',1),
        (14, 63,'SAN JOAQUIN',1),
        (15, 64,'SANTA ANA',1),
        (16, 65,'SAYAUSI',1),
        (17, 66,'SIDCAY',1),
        (18, 67,'SININCAY',1),
        (19, 68,'TARQUI',1),
        (20, 69,'TURI',1),
        (21, 70,'VALLE',1),
        (22, 71,'VICTORIA DEL PORTETE (IRQUIS)',1),

-- //GIRON
        (23, 50,'GIRON',2),
        (24, 51,'LA ASUNCION',2),
        (25, 52,'SAN GERARDO',2),

-- //GUALACEO
        (26, 50,'GUALACEO',3),
        (27, 52,'DANIEL CORDOVA TORAL (EL ORIENTE)',3),
        (28, 53,'JADAN',3),
        (29, 54,'MARIANO MORENO',3),
        (30, 56,'REMIGIO CRESPO TORAL (GULAG)',3),
        (31, 57,'SAN JUAN',3),
        (32, 58,'ZHIDMAD',3),
        (33, 59,'LUIS CORDERO VEGA',3),
        (34, 60,'SIMON BOLIVAR (CAB. EN GAÑANZOL)',3),

-- //NABON
        (35, 50,'NABON',4),
        (36, 51,'COCHAPATA',4),
        (37, 52,'EL PROGRESO (CAB. EN ZHOTA)',4),
        (38, 53,'LAS NIEVES (CHAYA)',4),

-- //PAUTE
        (39, 50,'PAUTE',5),
        (40, 52,'BULAN (JOSE VICTOR IZQUIERDO)',5),
        (41, 53,'CHICAN (GUILLERMO ORTEGA)',5),
        (42, 54,'EL CABO',5),
        (43, 56,'GUARAINAG',5),
        (44, 59,'SAN CRISTOBAL (CARLOS ORDOÑEZ LAZO)',5),
        (45, 61,'TOMEBAMBA',5),
        (46, 62,'DUG DUG',5),

-- //PUCARA
        (47, 50,'PUCARA',6),
        (48, 52,'SAN RAFAEL DE SHARUG',6),

-- //SAN FERNANDO
        (49, 50,'SAN FERNANDO',7),
        (50, 51,'SAN RAFAEL DE SHARUG',7),

-- //SANTA ISABEL
        (51, 50,'SANTA ISABEL (CHAGUARURCO)',8),
        (52, 51,'ABDON CALDERON (LA UNION)',8),
        (53, 52,'EL CARMEN DE PIJILI',8),
        (54, 53,'ZHAGLLI (SHAGLLI )',8),
        (55, 54,'SAN SALVADOR DE CAÑARIBAMBA',8),

-- //SIGSIG
        (56, 50,'SIGSIG',9),
        (57, 51,'CUCHIL',9),
        (58, 52,'GIMA',9),
        (59, 53,'GUEL',9),
        (60, 54,'LUDO',9),
        (61, 55,'SAN BARTOLOME',9),
        (62, 56,'SAN JOSE DE RARANGA',9),

-- //OÑA
        (63, 50,'SAN FELIPE DE OÑA',10),
        (64, 51,'SUSUDEL',10),

-- //CHORDELEG
        (65, 50,'CHORDELEG',11),
        (66, 51,'PRINCIPAL',11),
        (67, 52,'LA UNION',11),
        (68, 53,'LUIS GALARZA ORELLANA (CAB. EN DELEGSOL)',11),
        (69, 54,'SAN MARTIN DE PUZHIO',11),

-- //EL PAN
        (70, 50,'EL PAN',12),
        (71, 53,'SAN VICENTE',12),

-- //SEVILLA DE ORO
        (72, 50,'SEVILLA DE ORO',13),
        (73, 51,'AMALUZA',13),
        (74, 52,'PALMAS',13),

-- //GUACHAPALA
        (75, 50,'GUACHAPALA',14),

/** BOLIVAR **/

-- //GUARANDA
        (76, 50,'CAMILO PONCE ENRIQUEZ',16),
        (77, 01,'ÁNGEL POLIBIO CHÁVES ',16),
        (78, 02,'GABRIEL IGNACIO VEINTIMILLA',16),
        (79, 03,'GUANUJO',16),
        (80, 51,'FACUNDO VELA',16),
        (81, 53,'JULIO E. MORENO (CATANAHUAN GRANDE) ',16),
        (82, 55,'SALINAS',16),
        (83, 56,'SAN LORENZO',16),
        (84, 57,'SAN SIMON (YACOTO)',16),
        (85, 58,'SANTA FE (SANTA FE)',16),
        (86, 59,'SIMIATUG',16),
        (87, 60,'SAN LUIS DE PAMBIL',16),

-- //CHILLANES
        (88, 50,'CHILLANES',17),
        (89, 51,'SAN JOSE DEL TAMBO (TAMBOPAMBA)',17),

-- //CHIMBO
        (90, 50,'SAN JOSE DE CHIMBO',18),
        (91, 51,'ASUNCION (ASANCOTO)',18),
        (92, 53,'LA MAGDALENA (CHAPACOTO)',18),
        (93, 54,'SAN SEBASTIAN',18),
        (94, 55,'TELIMBELA',18),

-- //ECHEANDIA
        (95, 50,'ECHEANDIA',19),

-- //SAN MIGUEL
        (96, 50,'SAN MIGUEL',20),
        (97, 51,'BALSAPAMBA',20),
        (98, 52,'BILOVAN',20),
        (99, 53,'REGULO DE MORA',20),
        (100, 54,'SAN PABLO (SAN PABLO DE ATENAS)',20),
        (101, 55,'SANTIAGO',20),
        (102, 56,'SAN VICENTE',20),

-- //CALUMA
        (103, 50,'CALUMA',21),

-- //LAS NAVES
        (104, 50,'LAS MERCEDES',22),
        (105, 50,'LAS NAVES',22),

/** CAÑAR **/

-- //AZOGUES
        (106, 01,'AURELIO BAYAS MARTÍNEZ',23),
        (107, 02,'AZOGUES',23),
        (108, 03,'BORRERO ',23),
        (109, 04,'SAN FRANCISCO',23),
        (110, 51,'COJITAMBO',23),
        (111, 53,'GUAPAN',23),
        (112, 54,'JAVIER LOYOLA (CHUQUIPATA)',23),
        (113, 55,'LUIS CORDERO',23),
        (114, 56,'PINDILIG ',23),
        (115, 57,'RIVERA',23),
        (116, 58,'SAN MIGUEL',23),
        (117, 60,'TADAY',23),

-- //BIBLIAN
        (118, 50,'BIBLIAN',24),
        (119, 51,'NAZON (CAB. EN PAMPA DE DOMINGUEZ) ',24),
        (120, 52,'SAN FRANCISCO DE SAGEO',24),
        (121, 53,'TURUPAMBA ',24),
        (122, 54,'JERUSALEN',24),

-- //CAÑAR
        (123, 50,'CAÑAR',25),
        (124, 51,'CHONTAMARCA',25),
        (125, 52,'CHOROCOPTE',25),
        (126, 53,'GENERAL MORALES (SOCARTE)',25),
        (127, 54,'GUALLETURO',25),
        (128, 55,'HONORATO VASQUEZ (TAMBO VIEJO)',25),
        (129, 56,'INGAPIRCA',25),
        (130, 57,'JUNCAL',25),
        (131, 58,'SAN ANTONIO',25),
        (132, 61,'ZHUD',25),
        (133, 62,'VENTURA',25),
        (134, 63,'DUCUR',25),

-- //LA TRINCAL
        (135, 50,'LA TRONCAL',26),
        (136, 51,'MANUEL J. CALLE',26),
        (137, 52,'PANCHO NEGRO',26),

-- //EL TAMBO
        (138, 50,'EL TAMBO',27),

-- //DELEG
        (139, 50,'DELEG',28),
        (140, 51,'SOLANO',28),

-- //SUSCAL
        (141, 50,'SUSCAL',29),

/** CARCHI **/

-- //TULCAN
        (142, 01,'GONZÁLEZ SUÁREZ',30),
        (143, 02,'TULCÁN',30),
        (144, 51,'EL CARMELO (EL PUN)',30),
        (145, 53,'JULIO ANDRADE (OREJUELA)',30),
        (146, 54,'MALDONADO',30),
        (147, 55,'PIOTER',30),
        (148, 56,'TOBAR DONOSO (LA BOCANA DE CAMUMBI)',30),
        (149, 57,'TUFIÑO',30),
        (150, 58,'URBINA (TAYA)',30),
        (151, 59,'EL CHICAL',30),
        (152, 61,'SANTA MARTHA DE CUBA',30),

-- //BOLIVAR
        (153, 50,'BOLIVAR',31),
        (154, 51,'GARCIA MORENO',31),
        (155, 52,'LOS ANDES',31),
        (156, 53,'MONTE OLIVO',31),
        (157, 54,'SAN VICENTE DE PUSIR',31),
        (158, 55,'SAN RAFAEL',31),

-- //ESPEJO
        (159, 01,'EL ÁNGEL',32),
        (160, 02,'27 DE SEPTIEMBRE',33),
        (161, 51,'EL GOALTAL',32),
        (162, 52,'LA LIBERTAD (ALIZO)',32),
        (163, 53,'SAN ISIDRO',32),

-- //MIRA
        (164, 50,'MIRA (CHONTAHUASI)',33),
        (165, 51,'CONCEPCION',33),
        (166, 52,'JIJON Y CAAMAÑO (CAB. EN RIO BLANCO)',33),
        (167, 53,'JUAN MONTALVO (SAN IGNACIO DE QUIL)',33),

-- //MONTUFAR
        (168, 01,'GONZÁLEZ SUÁREZ',34),
        (169, 02,'SAN JOSÉ',34),
        (170, 51,'CRISTOBAL COLON',34),
        (171, 52,'CHITAN DE NAVARRETE',34),
        (172, 53,'FERNANDEZ SALVADOR',34),
        (173, 54,'LA PAZ',34),
        (174, 55,'PIARTAL',34),

-- //SAN PEDRO DE HUACA
        (175, 50,'HUACA',35),
        (176, 51,'MARISCAL SUCRE',35),

-- //LATACUNGA
        (177, 01,'ELOY ALFARO (SAN FELIPE)',36),
        (178, 02,'IGNACIO FLORES (PARQUE FLORES)',36),
        (179, 03,'JUAN MONTALVO (SAN SEBASTIÁN)',36),
        (180, 04,'LA MATRIZ',36),
        (181, 05,'SAN BUENAVENTURA',36),
        (182, 51,'ALAQUEZ (ALAQUES)',36),
        (183, 52,'BELISARIO QUEVEDO (GUANAILIN)',36),
        (184, 53,'GUAYTACAMA (GUAITACAMA)',36),
        (185, 54,'JOSEGUANGO BAJO',36),
        (186, 56,'MULALO',36),
        (187, 57,'11 DE NOVIEMBRE (ILINCHISI)',36),
        (188, 58,'POALO',36),
        (189, 59,'SAN JUAN DE PASTOCALLE',36),
        (190, 61,'TANICUCHI',36),
        (191, 62,'TOACASO',36),

-- //LA MANA
        (192, 01,'EL CARMEN',37),
        (193, 02,'LA MANÁ',37),
        (194, 03,'EL TRIUNFO',37),
        (195, 51,'GUASAGANDA (CAB. EN GUASAGANDA CENTRO)',37),
        (196, 52,'PUCAYACU',37),

-- //PANGUA
        (197, 50,'EL CORAZON',38),
        (198, 51,'MORASPUNGO',38),
        (199, 52,'PINLLOPATA',38),
        (200, 53,'RAMON CAMPAÑA',38),

-- //PUJILI
        (201, 50,'PUJILI',39),
        (202, 51,'ANGAMARCA',39),
        (203, 53,'GUANGAJE',39),
        (204, 55,'LA VICTORIA',39),
        (205, 56,'PILALO',39),
        (206, 57,'TINGO',39),
        (207, 58,'ZUMBAHUA',39),

-- //SALCEDO

        (208, 50,'SAN MIGUEL',40),
        (209, 51,'ANTONIO JOSE HOLGUIN (SANTA LUCIA) ',40),
        (210, 52,'CUSUBAMBA',40),
        (211, 53,'MULALILLO',40),
        (212, 54,'MULLIQUINDIL (SANTA ANA)',40),
        (213, 55,'PANSALEO',40),

-- //SAQUISILI

        (214, 50,'SAQUISILI',41),
        (215, 51,'CANCHAGUA',41),
        (216, 52,'CHANTILIN',41),
        (217, 53,'COCHAPAMBA',41),

-- //SIGCHOS

        (218, 50,'SIGCHOS',42),
        (219, 51,'CHUGCHILLAN',42),
        (220, 52,'ISINLIVI',42),
        (221, 53,'LAS PAMPAS',42),
        (222, 54,'PALO QUEMADO',42),

-- //RIOBAMBA

        (223, 01,'LIZARZABURU',43),
        (224, 02,'MALDONADO',43),
        (225, 03,'VELASCO',43),
        (226, 04,'VELOZ',43),
        (227, 05,'YARUQUÍES',43),
        (228, 51,'CACHA (CAB. EN MACHANGARA)',43),
        (229, 52,'CALPI',43),
        (230, 53,'CUBIJIES',43),
        (231, 54,'FLORES',43),
        (232, 55,'LICAN',43),
        (233, 56,'LICTO',43),
        (234, 57,'PUNGALA',43),
        (235, 58,'PUNIN',43),
        (236, 59,'QUIMIAG',43),
        (237, 60,'SAN JUAN',43),
        (238, 61,'SAN LUIS',43),

-- //ALAUSI
        (239, 50,'ALAUSI',44),
        (240, 51,'ACHUPALLAS',44),
        (241, 53,'GUASUNTOS',44),
        (242, 54,'HUIGRA',44),
        (243, 55,'MULTITUD',44),
        (244, 56,'PISTISHI (NARIZ DEL DIABLO)',44),
        (245, 57,'PUMALLACTA',44),
        (246, 58,'SEVILLA',44),
        (247, 59,'SIBAMBE',44),
        (248, 60,'TIXAN',44),

-- //COLTA
        (249, 01,'CAJABAMBA',45),
        (250, 02,'SICALPA',45),
        (251, 51,'CAÑI',45),
        (252, 52,'COLUMBE',45),
        (253, 53,'JUAN DE VELASCO (PANGOR)',45),
        (254, 54,'SANTIAGO DE QUITO (CAB. EN SAN ANTONIO DE QUITO)',45),

        (255, 50,'CHAMBO',46),

-- //CHUNCHI
        (256, 50,'CHUNCHI',47),
        (257, 51,'CAPZOL',47),
        (258, 52,'COMPUD',47),
        (259, 53,'GONZOL',47),
        (260, 54,'LLAGOS',47),

-- //GUAMOTE
        (261, 50,'GUAMOTE',48),
        (262, 51,'CEBADAS',48),
        (263, 52,'PALMIRA',48),

-- //GUANO
        (264, 01,'EL ROSARIO',49),
        (265, 02,'LA MATRIZ',49),
        (266, 51,'GUANANDO',49),
        (267, 52,'ILAPO',49),
        (268, 53,'LA PROVIDENCIA',49),
        (269, 54,'SAN ANDRES',49),
        (270, 55,'SAN GERARDO DE PACAICAGUAN',49),
        (271, 56,'SAN ISIDRO DE PATULU',49),
        (272, 57,'SAN JOSE DEL CHAZO',49),
        (273, 58,'SANTA FE DE GALAN',49),
        (274, 59,'VALPARAISO',49),

-- //PALLATANGA
        (275, 50,'VALPARAISO',50),

-- //PENIPE
        (276, 50,'PENIPE',51),
        (277, 51,'EL ALTAR',51),
        (278, 52,'MATUS',51),
        (279, 53,'PUELA',51),
        (280, 54,'SAN ANTONIO DE BAYUSHIG',51),
        (281, 55,'LA CANDELARIA',51),
        (282, 56,'BILBAO (CAB. EN QUILLUYACU)',51),

-- //CUMANDA
        (283, 50,'CUMANDA',52),

/** EL ORO **/

-- //MACHALA
        (284, 01,'LA PROVIDENCIA',53),
        (285, 02,'MACHALA',53),
        (286, 03,'PUERTO BOLÍVAR',53),
        (287, 04,'NUEVE DE MAYO',53),
        (288, 05,'EL CAMBIO',53),
        (289, 52,'EL RETIRO',53),

-- //ARENILLAS
        (290, 50,'ARENILLAS',54),
        (291, 51,'CHACRAS',54),
        (292, 54,'PALMALES',54),
        (293, 55,'CARCABON',54),
        (294, 56,'LA CUCA',54),

-- //ATAHUALPA
        (295, 50,'PACCHA',55),
        (296, 51,'AYAPAMBA',55),
        (297, 52,'CORDONCILLO',55),
        (298, 53,'MILAGRO',55),
        (299, 54,'SAN JOSE',55),
        (300, 55,'SAN JUAN DE CERRO AZUL',55),

-- //BALSAS
        (301, 50,'BALSAS',56),
        (302, 51,'BELLAMARIA',56),
-- //CHILLA
        (303, 50,'EL GUABO',57),

-- //EL GUABO
        (304, 51,'BARBONES (SUCRE)',58),
        (305, 52,'LA IBERIA',58),
        (306, 53,'TENDALES (CAB. EN PUERTO TENDALES) ',58),
        (307, 54,'RIO BONITO',58),

-- //HUAQUILLAS
        (308, 01,'ECUADOR',59),
        (309, 02,'EL PARAÍSO',59),
        (310, 03,'HUALTACO',59),
        (311, 04,'MILTON REYES',59),
        (312, 05,'UNIÓN LOJANA',59),

-- //MARCABELI
        (313, 50,'MARCABELI',60),
        (314, 51,'EL INGENIO',60),

-- //PASAJE
        (315, 01,'BOLÍVAR',61),
        (316, 02,'LOMA DE FRANCO',61),
        (317, 03,'OCHOA LEÓN (MATRIZ)',61),
        (318, 04,'TRES CERRITOS',61),
        (319, 51,'BUENAVISTA',61),
        (320, 52,'CASACAY',61),
        (321, 53,'LA PEAÑA',61),
        (322, 54,'PROGRESO',61),
        (323, 55,'UZHCURRUMI',61),
        (324, 55,'CAÑAQUEMADA',61),

-- //PIÑAS
        (325, 01,'LA MATRIZ',62),
        (326, 02,'LA SUSAYA',62),
        (327, 03,'PIÑAS GRANDE',62),
        (328, 51,'CAPIRO (CAB. EN LA CAPILLA DE CAPIRO) ',62),
        (329, 52,'LA BOCANA',62),
        (330, 53,'MOROMORO (CAB. EN EL VADO)',62),
        (331, 54,'PIEDRAS',62),
        (332, 55,'SAN ROQUE (AMBROSIO MALDONADO)',62),
        (333, 56,'SARACAY',62),

-- //PORTOVELO
        (334, 50,'PORTOVELO',63),
        (335, 51,'CURTINCAPA',63),
        (336, 52,'MORALES',63),
        (337, 53,'SALATI',63),

-- //SANTA ROSA
        (338, 01,'SANTA ROSA',64),
        (339, 02,'PUERTO JELÍ',64),
        (340, 03,'BALNEARIO JAMBELÍ (SATÉLITE)',64),
        (341, 04,'JUMÓN (SATÉLITE)',64),
        (342, 05,'NUEVO SANTA ROSA',64),
        (343, 51,'BELLAVISTA',64),
        (344, 52,'JAMBELI',64),
        (345, 53,'LA AVANZADA',64),
        (346, 54,'SAN ANTONIO',64),
        (347, 55,'TORATA',64),
        (348, 56,'VICTORIA',64),
        (349, 57,'BELLAMARIA',64),

-- //ZARUMA
        (350, 50,'ZARUMA',65),
        (351, 51,'ABAÑIN',65),
        (352, 52,'ARCAPAMBA',65),
        (353, 53,'GUANAZAN',65),
        (354, 54,'GUIZHAGUIÑA',65),
        (355, 55,'HUERTAS',65),
        (356, 56,'MALVAS',65),
        (357, 57,'MULUNCAY GRANDE',65),
        (358, 58,'SINSAO',65),
        (359, 59,'SALVIAS',65),

-- //LAS LAJAS
        (360, 01,'LA VICTORIA',66),
        (361, 02,'PLATANILLOS',66),
        (362, 03,'VALLE HERMOSO',66),
        (363, 51,'LA LIBERTAD',66),
        (364, 52,'EL PARAISO',66),
        (365, 53,'SAN ISIDRO',66),

-- //08 ESMERALDAS
        (366, 01,'BARTOLOMÉ RUIZ (CÉSAR FRANCO CARRIÓN) ',67),
        (367, 02,'5 DE AGOSTO',67),
        (368, 03,'ESMERALDAS',67),
        (369, 04,'LUIS TELLO (LAS PALMAS)',67),
        (370, 05,'SIMÓN PLATA TORRES',67),
        (371, 52,'CAMARONES (CAB. EN SAN VICENTE)',67),
        (372, 53,'CORONEL CARLOS CONCHA TORRES (CAB. EN HUELE)',67),
        (373, 54,'CHINCA',67),
        (374, 59,'MAJUA',67),
        (375, 63,'SAN MATEO',67),
        (376, 65,'TABIAZO',67),
        (377, 66,'TACHINA',67),
        (378, 68,'VUELTA LARGA',67),

-- //ELOY ALFARO
        (379, 50,'VALDEZ (LIMONES)',68),
        (380, 51,'ANCHAYACU',68),
        (381, 52,'ATAHUALPA (CAB. EN CAMARONES)',68),
        (382, 53,'BORBON',68),
        (383, 54,'LA TOLA',68),
        (384, 55,'LUIS VARGAS TORRES (CAB. EN PLAYA DE ORO)',68),
        (385, 56,'MALDONADO',68),
        (386, 57,'PAMPANAL DE BOLIVAR',68),
        (387, 58,'SAN FRANCISCO DE ONZOLE',68),
        (388, 59,'SANTO DOMINGO DE ONZOLE',68),
        (389, 60,'SELVA ALEGRE',68),
        (390, 61,'TELEMBI',68),
        (391, 62,'COLON ELOY DEL MARIA',68),
        (392, 63,'SAN JOSE DE CAYAPAS',68),
        (393, 64,'TIMBIRE',68),
        (394, 65,'SANTA LUCIA DE LAS PEÑAS',68),

-- //MUISNE
        (395, 50,'MUISNE',69),
        (396, 51,'BOLIVAR',69),
        (397, 52,'DAULE',69),
        (398, 53,'GALERA',69),
        (399, 54,'QUINGUE (OLMEDO PERDOMO FRANCO)',69),
        (400, 55,'SALIMA',69),
        (401, 56,'SAN FRANCISCO',69),
        (402, 57,'SAN GREGORIO',69),
        (403, 58,'SAN JOSE DE CHAMANGA',69),

-- //QUININDE
        (404, 50,'ROSA ZARATE (QUININDE)',70),
        (405, 51,'CUBE',70),
        (406, 52,'CHURA (CHANCAMA) (CAB. EN EL YERBERO) ',70),
        (407, 53,'MALIMPIA',70),
        (408, 54,'VICHE',70),
        (409, 55,'LA UNION',70),

-- //SAN LORENZO
        (410, 50,'SAN LORENZO',71),
        (411, 51,'ALTO TAMBO (CAB EN GUADUAL)',71),
        (412, 52,'ANCON (PICHANGAL) (CAB. EN PALMA REAL)',71),
        (413, 53,'CALDERON',71),
        (414, 54,'CARONDELET',71),
        (415, 55,'5 DE JUNIO (CAB. EN UIMBI)',71),
        (416, 56,'CONCEPCION',71),
        (417, 57,'MATAJE (CAB. EN SANTANDER)',71),
        (418, 58,'SAN JAVIER DE CACHAVI (CAB. EN SAN JAVIER)',71),
        (419, 59,'SANTA RITA',71),
        (420, 60,'TAMBILLO',71),
        (421, 61,'TULULBI (CAB. EN RICAURTE)',71),
        (422, 62,'URBINA',71),

-- //ATACAMES
        (423, 50,'ATACAMES',72),
        (424, 51,'LA UNION',72),
        (425, 52,'SUA (CAB. EN LA BOCANA)',72),
        (426, 53,'TONCHIGUE',72),
        (427, 54,'TONSUPA',72),

-- //RIOVERDE
        (428, 50,'RIOVERDE',73),
        (429, 51,'CHONTADURO',73),
        (430, 52,'CHUMUNDE',73),
        (431, 53,'LAGARTO',73),
        (432, 54,'MONTALVO (CAB EN HORQUETA)',73),
        (433, 55,'ROCAFUERTE',73),

/** GUAYAS **/
-- //GUAYAQUIL
        (434, 01,'AYACUCHO',74),
        (435, 02,'BOLÍVAR (SAGRARIO)',74),
        (436, 03,'CARBO (CONCEPCIÓN)',74),
        (437, 04,'FEBRES CORDERO',74),
        (438, 05,'GARCÍA MORENO',74),
        (439, 06,'LETAMENDI',74),
        (440, 07,'NUEVE DE OCTUBRE',74),
        (441, 08,'OLMEDO (SAN ALEJO)',74),
        (442, 09,'ROCA',74),
        (443, 10,'ROCAFUERTE',74),
        (444, 11,'SUCRE',74),
        (445, 12,'TARQUI',74),
        (446, 13,'URDANETA',74),
        (447, 14,'XIMENA',74),
        (448, 15,'PASCUALES',74),
        (449, 52,'JUAN GOMEZ RENDON (PROGRESO)',74),
        (450, 53,'MORRO',74),
        (451, 56,'POSORJA',74),
        (452, 57,'PUNA',74),
        (453, 58,'TENGUEL',74),

-- //ALFREDO VAQURIZO MORENO
        (454, 50,'ALFREDO BAQUERIZO MORENO (JUJAN)',75),

-- //BALAO
        (455, 50,'BALAO',76),

-- //BALZAR
        (456, 50,'BALZAR',77),

-- //COLIMES
        (457, 50,'COLIMES',78),
        (458, 51,'SAN JACINTO',78),

-- //DAULE
        (459, 01,'DAULE',79),
        (460, 02,'LA AURORA (SATÉLITE)',79),
        (461, 03,'BANIFE',79),
        (462, 04,'EMILIANO CAICEDO MARCOS',79),
        (463, 05,'MAGRO',79),
        (464, 06,'PADRE JUAN BAUTISTA AGUIRRE',79),
        (465, 07,'SANTA CLARA',79),
        (466, 08,'VICENTE PIEDRAHITA',79),
        (467, 52,'JUAN BAUTISTA AGUIRRE (LOS TINTOS)',79),
        (468, 53,'LAUREL',79),
        (469, 54,'LIMONAL',79),
        (470, 56,'LOS LOJAS (ENRIQUE BAQUERIZO MORENO)',79),

-- //DURAN
        (471, 03,'ELOY ALFARO (DURÁN)',80),
        (472, 02,'EL RECREO',80),
        (473, 03,'DIVINO NIÑO',80),

-- //EL EMPALME
        (474, 50,'VELASCO IBARRA (CAB. EL EMPALME)',81),
        (475, 51,'GUAYAS (PUEBLO NUEVO)',81),
        (476, 52,'EL ROSARIO',81),

-- //EL TRIUNFO
        (477, 50,'EL TRIUNFO',82),

-- //MILAGRO
        (478, 01,'CAMILO ANDRADE',83),
        (479, 02,'ELOY ALFARO',83),
        (480, 03,'CHIRIJOS',83),
        (481, 04,'CORONEL ENRIQUE VALDEZ',83),
        (482, 05,'ROSA MARIA',83),
        (483, 06,'JOSE MARIA VELASCO IBARRA',83),
        (484, 07,'VICENTE ROCAFUERTE',83),
        (485, 08,'ERNESTO SEMINARIO',83),
        (486, 09,'LAS PIÑAS',83),
        (487, 51,'CHOBO',83),
        (488, 53,'MARISCAL SUCRE (HUAQUES)',83),
        (489, 54,'ROBERTO ASTUDILLO (CAB. EN CRUCE DE VENECIA)',83),

-- //NARANJAL
        (490, 50,'NARANJAL',84),
        (491, 51,'JESUS MARIA',84),
        (492, 52,'SAN CARLOS',84),
        (493, 53,'SANTA ROSA DE FLANDES',84),
        (494, 54,'TAURA',84),

-- //NARANJITO
        (495, 50,'NARANJITO',85),

-- //PALESTINA
        (496, 50,'PALESTINA',86),

-- //PEDRO CARBO
        (497, 50,'PEDRO CARBO',87),
        (498, 51,'VALLE DE LA VIRGE',87),
        (499, 52,'SABANILLA',87),

-- //SAMBORONDÓN
        (500, 01,'SAMBORONDÓN',88),
        (501, 02,'LA PUNTILLA (SATÉLITE)',88),
        (502, 51,'TARIFA',88),

-- //SANTA LUCIA
        (503, 50,'SANTA LUCIA',89),

-- //SALITRE
        (504, 01,'BOCANA',90),
        (505, 02,'CANDILEJOS',90),
        (506, 03,'CENTRAL',90),
        (507, 04,'PARAÍSO',90),
        (508, 05,'SAN MATEO',90),
        (509, 51,'GENERAL VERNAZA (DOS ESTEROS)',90),
        (510, 52,'LA VICTORIA (ÑAUZA)',90),
        (511, 53,'JUNQUILLAL',90),

-- //SAN JACINTO DE YAGUACHI
        (512, 50,'SAN JACINTO DE YAGUACHI',91),
        (513, 50,'GENERAL PEDRO J. MONTERO (BOLICHE)',91),
        (514, 50,'YAGUACHI VIEJO (CONE)',91),
        (515, 50,'VIRGEN DE FATIMA',91),

-- //PLAYAS
        (516, 50,'GENERAL VILLAMIL (PLAYAS)',92),

-- //SIMON BOLIVAR
        (517, 50,'SIMON BOLIVAR',93),
        (518, 51,'CORONEL LORENZO DE GARAYCOA (PEDREGAL)',93),

-- //CORONEL MARCELINO MARIDUEÑA
        (519, 50,'CORONEL MARCELINO MARIDUEÑA (SAN CARLOS)',94),

-- //LOMAS DE SARGENTILLO
        (520, 50,'LOMAS DE SARGENTILLO',95),

-- //NARCISA DE JESUS
        (521, 50,'NARCISA DE JESUS',96),

-- //GENERAL ANTONIO ELIZALDE
        (522, 50,'GENERAL ANTONIO ELIZALDE (BUCAY)',97),

-- //ISIDRO AYORA
        (523, 50,'ISIDRO AYORA',98),

/** IMBABURA **/

-- //IBARRA
        (524, 01,'CARANQUI',99),
        (525, 02,'GUAYAQUIL DE ALPACHACA',99),
        (526, 03,'SAGRARIO',99),
        (527, 04,'SAN FRANCISCO',99),
        (528, 05,'LA DOLOROSA DEL PRIORATO',99),
        (529, 51,'AMBUQUI',99),
        (530, 52,'ANGOCHAGUA',99),
        (531, 53,'CAROLINA',99),
        (532, 54,'LA ESPERANZA',99),
        (533, 55,'LITA',99),
        (534, 56,'SALINAS',99),
        (535, 57,'SAN ANTONIO',99),

-- //ATONIO ANTE
        (536, 01,'ANDRADE MARÍN (LOURDES)',100),
        (537, 02,'ATUNTAQUI',100),
        (538, 51,'IMBAYA (SAN LUIS DE COBUENDO)',100),
        (539, 52,'SAN FRANCISCO DE NATABUELA',100),
        (540, 53,'SAN JOSE DE CHALTURA',100),
        (541, 54,'SAN ROQUE',100),

-- //COTACACHI
        (542, 01,'SAGRARIO',101),
        (543, 02,'SAN FRANCISCO',101),
        (544, 51,'APUELA',101),
        (545, 52,'GARCIA MORENO (LLURIMAGUA)',101),
        (546, 53,'IMANTAG',101),
        (547, 54,'PEÑAHERRERA',101),
        (548, 55,'PLAZA GUTIERREZ (CALVARIO)',101),
        (549, 56,'QUIROGA',101),
        (550, 57,'SEIS DE JULIO DE CUELLAJE (CAB. EN CUELLAJE)',101),
        (551, 58,'VACAS GALINDO (EL CHURO) (CAB. EN SAN MIGUEL ALTO)',101),

-- //OTAVALO
        (552, 01,'JORDÁN',102),
        (553, 02,'SAN LUIS',102),
        (554, 51,'DOCTOR MIGUEL EGAS CABEZAS (PEGUCHE)',102),
        (555, 52,'EUGENIO ESPEJO (CALPAQUI)',102),
        (556, 53,'GONZALEZ SUAREZ',102),
        (557, 54,'PATAQUI',102),
        (558, 55,'SAN JOSE DE QUICHINCHE',102),
        (559, 56,'SAN JUAN DE ILUMAN',102),
        (560, 57,'SAN PABLO',102),
        (561, 58,'SAN RAFAEL',102),
        (562, 59,'SELVA ALEGRE (CAB. EN SAN MIGUEL DE PAMPLONA)',102),

-- //PIMAMPIRO
        (563, 50,'PIMAMPIRO',103),
        (564, 51,'CHUGA',103),
        (565, 52,'MARIANO ACOSTA',103),
        (566, 53,'SAN FRANCISCO DE SIGSIPAMBA',103),

-- //SAN MIGUEL DE URCUQUI
        (567, 50,'URCUQUI',104),
        (568, 51,'CAHUASQUI',104),
        (569, 52,'LA MERCED DE BUENOS AIRES',104),
        (570, 53,'PABLO ARENAS',104),
        (571, 54,'SAN BLAS',104),
        (572, 55,'TUMBABIRO',104),

/** LOJA **/

-- //LOJA
        (573, 01,'EL SAGRARIO',105),
        (574, 02,'SAN SEBASTIÁN',105),
        (575, 03,'SUCRE',105),
        (576, 04,'VALLE',105),
        (577, 05,'CARIGÁN',105),
        (578, 06,'PUNZARA',105),
        (579, 51,'CHANTACO',105),
        (580, 52,'CHUQUIRIBAMBA',105),
        (581, 53,'EL CISNE',105),
        (582, 54,'GUALEL',105),
        (583, 55,'JIMBILLA',105),
        (584, 56,'MALACATOS (VALLADOLID)',105),
        (585, 57,'SAN LUCAS',105),
        (586, 58,'SAN PEDRO DE VILCABAMBA',105),
        (587, 59,'SANTIAGO',105),
        (588, 60,'TAQUIL (MIGUEL RIOFRIO)',105),
        (589, 61,'VILCABAMBA (VICTORIA) ',105),
        (590, 62,'YANGANA (ARSENIO CASTILLO)',105),
        (591, 63,'QUINARA',105),

-- //CALVAS
        (592, 01,'CARIAMANGA',106),
        (593, 02,'CHILE',106),
        (594, 03,'SAN VICENTE',106),
        (595, 51,'COLAISACA',106),
        (596, 52,'EL LUCERO',106),
        (597, 53,'UTUANA',106),
        (598, 54,'SANGUILLIN',106),

-- //CATAMAYO
        (599, 01,'CATAMAYO',107),
        (600, 02,'SAN JOSÉ',107),
        (601, 51,'EL TAMBO',107),
        (602, 52,'GUAYQUICHUMA',107),
        (603, 53,'SAN PEDRO DE LA BENDITA',107),
        (604, 54,'ZAMBI',107),

-- //CELICA
        (605, 50,'CELICA',108),
        (606, 51,'CRUZPAMBA (CAB EN CARLOS BUSTAMANTE)',108),
        (607, 55,'POZUL (SAN JUAN DE POZUL)',108),
        (608, 56,'SABANILLA',108),
        (609, 57,'TENIENTE MAXIMILIANO RODRIGUEZ LOAIZA',108),

-- //CHAGUARPAMBA
        (610, 50,'CHAGUARPAMBA',109),
        (611, 51,'BUENAVISTA',109),
        (612, 52,'EL ROSARIO',109),
        (613, 53,'SANTA RUFINA',109),
        (614, 54,'AMARILLOS',109),

-- //ESPINDOLA
        (615, 50,'AMALUZA',110),
        (616, 51,'BELLAVISTA',110),
        (617, 52,'JIMBURA',110),
        (618, 53,'SANTA TERESITA',110),
        (619, 54,'27 DE ABRIL (CAB. EN LA NARANJA)',110),
        (620, 55,'EL INGENIO',110),
        (621, 56,'EL AIRO',110),

-- //GONZANAMA
        (622, 50,'GONZANAMA',111),
        (623, 51,'CHANGAIMINA (LA LIBERTAD)',111),
        (624, 53,'NAMBACOLA',111),
        (625, 54,'PURUNUMA (EGUIGUREN)',111),
        (626, 56,'SACAPALCA',111),

-- //MACARA
        (627, 01,'GENERAL ELOY ALFARO (SAN SEBASTIÁN)',112),
        (628, 02,'MACARÁ (MANUEL ENRIQUE RENGEL SUQUILANDA)',112),
        (629, 51,'LARAMA',112),
        (630, 52,'LA VICTORIA',112),
        (631, 53,'SABIANGO (LA CAPILLA)',112),

-- //PALTAS
        (632, 01,'CATACOCHA',113),
        (633, 02,'LOURDES',113),
        (634, 51,'CANGONAMA',113),
        (635, 52,'GUACHANAMA',113),
        (636, 54,'LAURO GUERRERO',113),
        (637, 56,'ORIANGA',113),
        (638, 57,'SAN ANTONIO',113),
        (639, 58,'CASANGA',113),
        (640, 59,'YAMANA',113),

-- //PUYANGO
        (641, 50,'ALAMOR',114),
        (642, 51,'CIANO',114),
        (643, 52,'EL ARENAL',114),
        (644, 53,'EL LIMO (MARIANA DE JESUS)',114),
        (645, 54,'MERCADILLO',114),
        (646, 55,'VICENTINO',114),

-- //SARAGURO
        (647, 50,'SARAGURO',115),
        (648, 51,'EL PARAISO DE CELEN',115),
        (649, 52,'EL TABLON',115),
        (650, 53,'LLUZHAPA',115),
        (651, 54,'MANU',115),
        (652, 55,'SAN ANTONIO DE QUMBE (CUMBE)',115),
        (653, 56,'SAN PABLO DE TENTA',115),
        (654, 57,'SAN SEBASTIAN DE YULUC',115),
        (655, 58,'SELVA ALEGRE',115),
        (656, 59,'URDANETA (PAQUISHAPA)',115),
        (657, 60,'SUMAYPAMBA',115),

-- //SOZORANGA
        (658, 50,'SOZORANGA',116),
        (659, 51,'NUEVA FATIMA',116),
        (660, 52,'TACAMOROS',116),

-- //ZAPOTILLO
        (661, 50,'ZAPOTILLO',117),
        (662, 51,'MANGAHURCO',117),
        (663, 52,'GARZAREAL',117),
        (664, 53,'LIMONES',117),
        (665, 54,'PALETILLAS',117),
        (666, 55,'BOLASPAMBA',117),
        (667, 56,'CAZADEROS',117),

-- //PINDAL
        (668, 50,'PINDAL',118),
        (669, 51,'CHAQUINAL',118),
        (670, 52,'12 DE DICIEMBRE (CAB. EN ACHIOTES)',118),
        (671, 53,'MILAGROS',118),

-- //QUILANGA
        (672, 50,'QUILANGA',119),
        (673, 51,'FUNDOCHAMBA',119),
        (674, 52,'SAN ANTONIO DE LAS ARADAS (CAB. EN LAS ARADAS)',119),

-- //OLMEDO
        (675, 50,'OLMEDO',120),
        (676, 51,'LA TINGUE',120),

/** LOS RIOS **/
-- //BABAHOYO
        (677, 01,'CLEMENTE BAQUERIZO',121),
        (678, 02,'DOCTOR CAMILO PONCE',121),
        (679, 03,'BARREIRO',121),
        (680, 04,'EL SALTO',121),
        (681, 52,'CARACOL',121),
        (682, 53,'FEBRES CORDERO (LAS JUNTAS)',121),
        (683, 54,'PIMOCHA',121),
        (684, 55,'LA UNION',121),

-- //BABA
        (685, 50,'BABA',122),
        (686, 51,'GUARE',122),
        (687, 52,'ISLA DE BEJUCAL',122),

-- //MONTALVO
        (688, 50,'MONTALVO',123),
        (689, 51,'LA ESMERALDA',123),

-- //PUEBLOVIEJO
        (690, 50,'PUEBLOVIEJO',124),
        (691, 51,'PUERTO PECHICHE',124),
        (692, 52,'SAN JUAN',124),

-- //QUEVEDO
        (693, 01,'QUEVEDO',125),
        (694, 02,'SAN CAMILO',125),
        (695, 04,'GUAYACÁN',125),
        (696, 05,'NICOLÁS INFANTE DÍAZ',125),
        (697, 06,'SAN CRISTÓBAL',125),
        (698, 07,'SIETE DE OCTUBRE',125),
        (699, 08,'24 DE MAYO',125),
        (700, 09,'VENUS DEL RÍO QUEVEDO',125),
        (701, 10,'VIVA ALFARO',125),
        (702, 53,'SAN CARLOS',125),
        (703, 55,'LA ESPERANZA',125),

-- //URDANETA
        (704, 50,'CATARAMA',126),
        (705, 51,'RICAURTE',126),

-- //VENTANAS
        (706, 01,'10 DE NOVIEMBRE',127),
        (707, 02,'VENTANAS',127),
        (708, 52,'ZAPOTAL',127),
        (709, 53,'CHACARITA',127),
        (710, 54,'LOS ANGELES',127),

-- //VINCES
        (711, 01,'BALZAR DE VINCES',128),
        (712, 02,'VINCES CENTRAL',128),
        (713, 03,'SAN LORENZO DE VINCES',128),
        (714, 51,'ANTONIO SOTOMAYOR (CAB. EN PLAYAS DE VINCES)',128),

-- //PALENQUE
        (715, 50,'PALENQUE',129),

-- //BUENA FE
        (716, 01,'SAN JACINTO DE BUENA FÉ',130),
        (717, 02,'7 DE AGOSTO',130),
        (718, 03,'11 DE OCTUBRE',130),
        (719, 51,'PATRICIA PILAR',130),

-- //VALENCIA
        (720, 01,'VALENCIA',131),
        (721, 02,'LA UNION',131),
        (722, 03,'LA NUEVA UNION',131),

-- //MOCACHE
        (723, 50,'MOCACHE',132),

-- //QUINSALOMA
        (724, 50,'QUINSALOMA',133),

/** MANABI **/

-- //PORTOVIEJO
        (725, 01,'PORTOVIEJO',134),
        (726, 02,'12 DE MARZO',134),
        (727, 03,'COLÓN',134),
        (728, 04,'PICOAZÁ',134),
        (729, 05,'SAN PABLO',134),
        (730, 06,'ANDRÉS DE VERA',134),
        (731, 07,'FRANCISCO PACHECO',134),
        (732, 08,'18 DE OCTUBRE',134),
        (733, 09,'SIMÓN BOLÍVAR',134),
        (734, 51,'ABDON CALDERON (SAN FRANCISCO)',134),
        (735, 52,'ALHAJUELA (BAJO GRANDE)',134),
        (736, 53,'CRUCITA',134),
        (737, 54,'PUEBLO NUEVO',134),
        (738, 55,'RIOCHICO (RIO CHICO)',134),
        (739, 56,'SAN PLACIDO ',134),
        (740, 57,'CHIRIJOS',134),

-- //BOLIVAR
        (741, 50,'CALCETA',135),
        (742, 51,'MEMBRILLO',135),
        (743, 52,'QUIROGA',135),
-- //CHONE
        (744, 01,'CHONE',136),
        (745, 02,'SANTA RITA',136),
        (746, 51,'BOYACA',136),
        (747, 52,'CANUTO',136),
        (748, 53,'CONVENTO',136),
        (749, 54,'CHIBUNGA',136),
        (750, 55,'ELOY ALFARO',136),
        (751, 56,'RICAURTE',136),
        (752, 57,'SAN ANTONIO',136),

-- //EL CARMEN
        (753, 01,'EL CARMEN',137),
        (754, 02,'4 DE DICIEMBRE',137),
        (755, 51,'WILFRIDO LOOR MOREIRA (MAICITO)',137),
        (756, 52,'SAN PEDRO DE SUMA',137),
        (757, 53,'SANTA MARIA (CAB EN SANTA MARIA)',137),
        (758, 54,'EL PARAISO LA 14 (CAB EN EL PARAISO) ',137),

-- //FLAVIO ALFARA
        (759, 50,'FLAVIO ALFARO',138),
        (760, 51,'SSAN FRANCISCO DE NOVILLO (CAB. EN NOVILLO) ',138),
        (761, 52,'ZAPALLO',138),

-- //JIPIJAPA
        (762, 01,'DOCTOR MIGUEL MORÁN LUCIO',139),
        (763, 02,'MANUEL INOCENCIO PARRALES Y GUALE',139),
        (764, 03,'SAN LORENZO DE JIPIJAPA',139),
        (765, 51,'AMERICA',139),
        (766, 52,'EL ANEGADO (CAB. EN ELOY ALFARO)',139),
        (767, 53,'JULCUY',139),
        (768, 54,'LA UNION',139),
        (769, 56,'MEMBRILLAL',139),
        (770, 57,'PEDRO PABLO GOMEZ',139),
        (771, 58,'PUERTO DE CAYO',139),

-- //JUNIN
        (772, 50,'JUNIN',140),

-- //MANTA
        (773, 01,'LOS ESTEROS',141),
        (774, 02,'SAN MATEO',141),
        (775, 03,'TARQUI',141),
        (776, 04,'JUNIN',141),
        (777, 05,'ELOY ALFARO',141),
        (778, 51,'SAN LORENZO',141),
        (779, 52,'SANTA MARIANITA (BOCA DE PACOCHE)',141),

-- //MONTECRISTI
        (780, 01,'ANÍBAL SAN ANDRÉS',142),
        (781, 02,'MONTECRISTI',142),
        (782, 03,'EL COLORADO',142),
        (783, 04,'GENERAL ELOY ALFARO',142),
        (784, 05,'LEONIDAS PROAÑO',142),
        (785, 52,'LA PILA',142),

-- //PAJAN
        (786, 50,'PAJAN',143),
        (787, 51,'CAMPOZANO (LA PALMA DE PAJAN)',143),
        (788, 52,'CASCOL',143),
        (789, 53,'GUALE',143),
        (790, 54,'LASCANO',143),

-- //PICHINCHA
        (791, 50,'PICHINCHA',144),
        (792, 51,'BARRAGANETE',144),
        (793, 52,'SAN SEBASTIAN',144),

-- //ROCAFUERTE
        (794, 52,'ROCAFUERTE',145),

-- //SANTA ANA
        (795, 52,'SANTA ANA',146),
        (796, 52,'LODANA',146),
        (797, 52,'AYACUCHO',146),
        (798, 52,'HONORATO VASQUEZ (CAB EN VASQUEZ)',146),
        (799, 52,'LA UNION',146),
        (800, 52,'SAN PABLO (CAB EN PUEBLO NUEVO)',146),

-- //SUCRE
        (801, 01,'BAHÍA DE CARÁQUEZ',147),
        (802, 02,'LEONIDAS PLAZA GUTIÉRREZ',147),
        (803, 53,'CHARAPOTO',147),
        (804, 57,'SAN ISIDRO',147),

-- //TOSAGUA
        (805, 58,'TOSAGUA',148),
        (806, 59,'BACHILLERO',148),
        (807, 60,'ANGEL PEDRO GILER (LA ESTANCILLA)',148),

-- //24 DE MAYO
        (808, 50,'SUCRE',149),
        (809, 51,'BELLAVISTA',149),
        (810, 52,'NOBOA',149),
        (811, 53,'ARQUITECTO SIXTO DURAN BALLEN',149),

-- //PEDERNALES
        (812, 50,'PEDERNALES',150),
        (813, 51,'COJIMIES',150),
        (814, 52,'DIEZ DE AGOSTO',150),
        (815, 53,'ATAHUALPA',150),

-- //OLMEDO
        (816, 50,'OLMEDO',151),

-- //PUERTO LOPEZ
        (817, 50,'PUERTO LOPEZ',152),
        (818, 51,'MACHALILLA',152),
        (819, 52,'SALANGO',152),

-- //JAMA
        (820, 50,'JAMA',153),

-- //JARAMIJO
        (821, 50,'JARAMIJO',154),

-- //SAN VICENTE
        (822, 50,'SAN VICENTE',155),
        (823, 51,'CANOA',155),

/** MORONA SANTIAGO **/
-- //MORONA
        (824, 50,'MACAS',156),
        (825, 51,'ALSHI (CAB EN 9 DE OCTUBRE)',156),
        (826, 53,'GENERAL PROAÑO',156),
        (827, 56,'SAN ISIDRO',156),
        (828, 57,'SEVILLA DON BOSCO',156),
        (829, 58,'SINAI',156),
        (830, 60,'ZUÑA (ZUÑAC)',156),
        (831, 62,'CUCHAENTZA',156),
        (832, 64,'RIO BLANCO',156),

-- //GUALAQUIZA
        (833, 01,'GUALAQUIZA',157),
        (834, 02,'MERCEDES MOLINA',157),
        (835, 51,'AMAZONAS (ROSARIO DE CUYES)',157),
        (836, 52,'BERMEJOS',157),
        (837, 53,'BOMBOIZA',157),
        (838, 54,'CHIGUINDA',157),
        (839, 55,'EL ROSARIO',157),
        (840, 56,'NUEVA TARQUI',157),
        (841, 57,'SAN MIGUEL DE CUYES',157),
        (842, 58,'EL IDEAL',157),

-- //LIMON INDANZA
        (843, 50,'GENERAL LEONIDAS PLAZA GUTIERREZ',158),
        (844, 51,'INDANZA',158),
        (845, 53,'SAN ANTONIO (CAB EN SAN ANTONIO CENTRO)',158),
        (846, 56,'SAN MIGUEL DE CONCHAY',158),
        (847, 57,'STA SUSANA DE CHIVIAZA (CAB EN CHIVIAZA)',158),
        (848, 58,'YUNGANZA (CAB EN EL ROSARIO)',158),

-- //PALORA
        (849, 50,'PALORA (METZERA)',159),
        (850, 51,'ARAPICOS',159),
        (851, 52,'CUMANDA (CAB EN COLONIA AGRICOLA SEVILLA DEL ORO)',159),
        (852, 54,'SANGAY (CAB EN NAYAMANACA)',159),
        (853, 55,'16 DE AGOSTO',159),

-- //SANTIAGO
        (854, 50,'SANTIAGO DE MENDEZ',160),
        (855, 51,'COPAL',160),
        (856, 52,'CHUPIANZA',160),
        (857, 53,'PATUCA',160),
        (858, 54,'SAN LUIS DE EL ACHO (CAB EN EL ACHO) ',160),
        (859, 56,'TAYUZA',160),
        (860, 57,'SAN FRANCISCO DE CHINIMBIMI',160),

-- //SUCUA
        (861, 50,'SUCUA',161),
        (862, 51,'ASUNCION',161),
        (863, 52,'HUAMBI',161),
        (864, 55,'SANTA MARIANITA DE JESUS',161),

-- //HUAMBOYA
        (865, 50,'HUAMBOYA',162),
        (866, 51,'CHIGUAZA',162),

-- //SAN JUAN BOSCO
        (867, 50,'SAN JUAN BOSCO',163),
        (868, 51,'PAN DE AZUCAR',163),
        (869, 52,'SAN CARLOS DE LIMON',163),
        (870, 53,'SAN JACINTO DE WAKAMBEIS',163),
        (871, 54,'SANTIAGO DE PANANZA',163),

-- //TAISHA
        (872, 50,'TAISHA',164),
        (873, 51,'HUASAGA (CAB EN WAMPUIK)',164),
        (874, 52,'MACUMA',164),
        (875, 53,'TUUTINENTZA',164),
        (876, 54,'PUMPUENTSA',164),

-- //LOGROÑO
        (877, 50,'LOGROÑO',165),
        (878, 51,'YAUPI',165),
        (879, 52,'SHIMPIS',165),

-- //PABLO SEXTO
        (880, 50,'PABLO SEXTO',166),

-- //TIWINTZA
        (881, 50,'PABLO SEXTO',167),
        (882, 51,'SAN JOSE DE MORONA',167),

-- //15 NAPO
        (883, 50,'TENA',168),
        (884, 51,'AHUANO',168),
        (885, 53,'CHONTAPUNTA',168),
        (886, 54,'PANO',168),
        (887, 55,'PUERTO MISAHUALLI',168),
        (888, 56,'PUERTO NAPO',168),
        (889, 57,'TALAG',168),
        (890, 58,'SAN JUAN DE MUYUNA',168),

-- //ARCHIDONA
        (891, 50,'ARCHIDONA',169),
        (892, 52,'COTUNDO',169),
        (893, 54,'SAN PABLO DE USHPAYACU',169),
        (894, 56,'HATUN SUMAKU',169),

-- //EL CHACO
        (895, 50,'EL CHACO',170),
        (896, 51,'GONZALO DIAZ DE PINEDA (EL BOMBON)',170),
        (897, 52,'LINARES',170),
        (898, 53,'OYACACHI',170),
        (899, 54,'SANTA ROSA',170),
        (900, 55,'SARDINAS',170),

-- //QUIJOS
        (901, 50,'BAEZA',171),
        (902, 51,'COSANGA',171),
        (903, 52,'CUYUJA',171),
        (904, 53,'PAPALLACTA',171),
        (905, 54,'SAN FRANCISCO DE BORJA (VIRGILIO DAVILA)',171),
        (906, 56,'SUMACO',171),

-- //CARLOS JULIO AROSEMENA TOLA
        (907, 50,'CARLOS JULIO AROSEMENA TOLA',172),

/** PASTAZA **/

-- //PASTAZA
        (908, 50,'PUYO',173),
        (909, 52,'CANELOS',173),
        (910, 54,'DIEZ DE AGOSTO',173),
        (911, 55,'FATIMA',173),
        (912, 56,'MONTALVO (ANDOAS)',173),
        (913, 57,'POMONA',173),
        (914, 58,'RIO CORRIENTES',173),
        (915, 59,'RIO TIGRE',173),
        (916, 61,'SARAYACU',173),
        (917, 62,'SIMON BOLIVAR (CAB. EN MUSHULLACTA) ',173),
        (918, 63,'TARQUI',173),
        (919, 64,'TENIENTE HUGO ORTIZ',173),
        (920, 65,'VERACRUZ (INDILLAMA) (CAB. EN INDILLAMA)',173),
        (921, 66,'EL TRIUNFO',173),

-- //MERA
        (922, 50,'MERA',174),
        (923, 51,'MADRE TIERRA',174),
        (924, 52,'SHELL',174),

-- //SANTA CLARA
        (925, 50,'SANTA CLARA',175),
        (926, 51,'SAN JOSE',175),

-- //ARAJUNO
        (927, 50,'ARAJUNO',176),
        (928, 51,'CURARAY',176),

/** PICHINCHA **/
-- //DISTRITO METROPOLITANO DE QUITO
        (929, 01,'BELISARIO QUEVEDO',177),
        (930, 02,'CARCELÉN',177),
        (931, 03,'CENTRO HISTÓRICO',177),
        (932, 04,'COCHAPAMBA',177),
        (933, 05,'COMITÉ DEL PUEBLO',177),
        (934, 06,'COTOCOLLAO',177),
        (935, 07,'CHILIBULO',177),
        (936, 08,'CHILLOGALLO',177),
        (937, 09,'CHIMBACALLE',177),
        (938, 10,'EL CONDADO',177),
        (939, 11,'GUAMANÍ',177),
        (940, 12,'IÑAQUITO',177),
        (941, 13,'ITCHIMBIA',177),
        (942, 14,'JIPIJAPA',177),
        (943, 15,'KENNEDY',177),
        (944, 16,'LA ARGELIA',177),
        (945, 17,'LA CONCEPCIÓN',177),
        (946, 18,'LA ECUATORIANA',177),
        (947, 19,'LA FERROVIARIA',177),
        (948, 20,'LA LIBERTAD',177),
        (949, 21,'LA MAGDALENA',177),
        (950, 22,'LA MENA',177),
        (951, 23,'MARISCAL SUCRE',177),
        (952, 24,'PONCEANO',177),
        (953, 25,'PUENGASÍ',177),
        (954, 26,'QUITUMBE',177),
        (955, 27,'RUMIPAMBA',177),
        (956, 28,'SAN BARTOLO',177),
        (957, 29,'SAN ISIDRO DEL INCA',177),
        (958, 30,'SAN JUAN',177),
        (959, 31,'SOLANDA',177),
        (960, 32,'TURUBAMBA',177),
        (961, 51,'ALANGASI',177),
        (962, 52,'AMAGUAÑA',177),
        (963, 53,'ATAHUALPA (HABASPAMBA)',177),
        (964, 54,'CALACALI',177),
        (965, 55,'CALDERON (CARAPUNGO)',177),
        (966, 56,'CONOCOTO',177),
        (967, 57,'CUMBAYA',177),
        (968, 58,'CHAVEZPAMBA',177),
        (969, 59,'CHECA (CHILPA)',177),
        (970, 60,'EL QUINCHE',177),
        (971, 61,'GUALEA',177),
        (972, 62,'GUANGOPOLO',177),
        (973, 63,'GUAYLLABAMBA',177),
        (974, 64,'LA MERCED',177),
        (975, 65,'LLANO CHICO',177),
        (976, 66,'LLOA',177),
        (977, 68,'NANEGAL',177),
        (978, 69,'NANEGALITO',177),
        (979, 70,'NAYON',177),
        (980, 71,'NONO',177),
        (981, 72,'PACTO',177),
        (982, 74,'PERUCHO',177),
        (983, 75,'PIFO',177),
        (984, 76,'PINTAG',177),
        (985, 77,'POMASQUI',177),
        (986, 78,'PUELLARO',177),
        (987, 79,'PUEMBO',177),
        (988, 80,'SAN ANTONIO',177),
        (989, 81,'SAN JOSE DE MINAS',177),
        (990, 83,'TABABELA',177),
        (991, 84,'TUMBACO',177),
        (992, 85,'YARUQUI',177),
        (993, 86,'ZAMBIZA',177),

-- //CAYAMBE
        (994, 02,'CAYAMBE',178),
        (995, 03,'JUAN MONTALVO',178),
        (996, 51,'ASCAZUBI',178),
        (997, 52,'CANGAHUA',178),
        (998, 53,'OLMEDO (PESILLO)',178),
        (999, 54,'OTON',178),
        (1000, 55,'SANTA ROSA DE CUZUBAMBA',178),
        (1001, 56,'SAN JOSE DE AYORA',178),

-- //MEJIA
        (1002, 50,'MACHACHI',179),
        (1003, 51,'ALOAG',179),
        (1004, 52,'ALOASI',179),
        (1005, 53,'CUTUGLAHUA',179),
        (1006, 54,'EL CHAUPI',179),
        (1007, 55,'MANUEL CORNEJO ASTORGA (TANDAPI)',179),
        (1008, 56,'TAMBILLO',179),
        (1009, 57,'UYUMBICHO',179),

-- //PEDRO MONCAYO
        (1010, 50,'TABACUNDO',180),
        (1011, 51,'LA ESPERANZA',180),
        (1012, 52,'MALCHINGUI',180),
        (1013, 53,'TOCACHI ',180),
        (1014, 54,'TUPIGACHI',180),

-- //RUMIÑAHUI
        (1015, 01,'SANGOLQUÍ',181),
        (1016, 02,'SAN PEDRO DE TABOADA',181),
        (1017, 03,'SAN RAFAEL',181),
        (1018, 04,'FAJARDO',181),
        (1019, 51,'COTOGCHOA',181),
        (1020, 52,'RUMIPAMBA',181),

-- //SAN MIGUEL DE LOS BANCOS
        (1021, 50,'SAN MIGUEL DE LOS BANCOS',182),
        (1022, 51,'MINDO',182),

-- //PEDRO VICENTE MALDONADO
        (1023, 50,'PEDRO VICENTE MALDONADO',183),

-- //PUERTO QUITO
        (1024, 50,'PUERTO QUITO',184),

/** TUNGURAHUA **/
-- //AMBATO
        (1025, 01,'ATOCHA – FICOA',185),
        (1026, 02,'CELIANO MONGE',185),
        (1027, 03,'HUACHI CHICO',185),
        (1028, 04,'HUACHI LORETO',185),
        (1029, 05,'LA MERCED',185),
        (1030, 06,'LA PENÍNSULA',185),
        (1031, 07,'MATRIZ',185),
        (1032, 08,'PISHILATA',185),
        (1033, 09,'SAN FRANCISCO',185),
        (1034, 51,'AMBATILLO',185),
        (1035, 52,'ATAHUALPA (CHISALATA)',185),
        (1036, 53,'AUGUSTO N. MARTINEZ (MUNDUGLEO)',185),
        (1037, 54,'CONSTANTINO FERNANDEZ (CAB. EN CULLITAHUA)',185),
        (1038, 55,'HUACHI GRANDE',185),
        (1039, 56,'IZAMBA',185),
        (1040, 57,'JUAN BENIGNO VELA',185),
        (1041, 58,'MONTALVO',185),
        (1042, 59,'PASA',185),
        (1043, 60,'PICAIGUA',185),
        (1044, 61,'PILAGUIN (PILAHUIN)',185),
        (1045, 62,'QUISAPINCHA (QUIZAPINCHA)',185),
        (1046, 63,'SAN BARTOLOME DE PINLLOG',185),
        (1047, 64,'SAN FERNANDO (PASA SAN FERNANDO)',185),
        (1048, 65,'SANTA ROSA',185),
        (1049, 66,'TOTORAS',185),
        (1050, 67,'CUNCHIBAMBA',185),
        (1051, 68,'UNAMUNCHO',185),

-- //BAÑOS DE AGUA SANTA
        (1052, 50,'BAÑOS DE AGUA SANTA',186),
        (1053, 51,'LLIGUA',186),
        (1054, 52,'RIO NEGRO',186),
        (1055, 53,'RIO VERDE',186),
        (1056, 54,'ULBA',186),

-- //CEVALLOS
        (1057, 50,'CEVALLOS',187),

-- //MOCHA
        (1058, 50,'MOCHA',188),
        (1059, 51,'PINGUILI',188),

-- //PATATE
        (1060, 50,'PATATE',189),
        (1061, 51,'EL TRIUNFO',189),
        (1062, 52,'LOS ANDES (CAB. EN POATUG)',189),
        (1063, 53,'SUCRE (CAB. EN SUCRE-PATATE URCU)',189),

-- //QUERO
        (1064, 50,'QUERO',190),
        (1065, 51,'RUMIPAMBA',190),
        (1066, 52,'YANAYACU - MOCHAPATA (CAB. EN YANAYACU)',190),

-- //SANPEDRO DE PELILEO
        (1067, 01,'PELILEO',191),
        (1068, 02,'PELILEO GRANDE',191),
        (1069, 51,'BENITEZ (PACHANLICA)',191),
        (1070, 52,'BOLIVAR',191),
        (1071, 53,'COTALO',191),
        (1072, 54,'CHIQUICHA (CAB. EN CHIQUICHA GRANDE)',191),
        (1073, 55,'EL ROSARIO (RUMICHACA)',191),
        (1074, 56,'GARCIA MORENO (CHUMAQUI)',191),
        (1075, 57,'GUAMBALO (HUAMBALO)',191),
        (1076, 58,'SALASACA',191),

-- //SANTIAGO DE PILLARDO
        (1077, 01,'CIUDAD NUEVA',192),
        (1078, 02,'PÍLLARO',192),
        (1079, 51,'BAQUERIZO MORENO',192),
        (1080, 52,'EMILIO MARIA TERAN (RUMIPAMBA)',192),
        (1081, 53,'MARCOS ESPINEL (CHACATA)',192),
        (1082, 54,'PRESIDENTE URBINA (CHAGRAPAMBA - PATZUCUL)',192),
        (1083, 55,'SAN ANDRES',192),
        (1084, 56,'SAN JOSE DE POALO',192),
        (1085, 57,'SAN MIGUELITO',192),

-- //TISALEO
        (1086, 50,'TISALEO',193),
        (1087, 51,'QUINCHICOTO',193),

/** ZAMORA CHINCHIPE **/

-- //ZAMORA
        (1088, 01,'EL LIMÓN',194),
        (1089, 02,'ZAMORA',194),
        (1090, 51,'CUMBARATZA',194),
        (1091, 52,'GUADALUPE',194),
        (1092, 53,'IMBANA (LA VICTORIA DE IMBANA)',194),
        (1093, 55,'SABANILLA',194),
        (1094, 56,'TIMBARA',194),
        (1095, 58,'SAN CARLOS DE LAS MINAS',194),

-- //CHINCHIPE
        (1096, 50,'ZUMBA',195),
        (1097, 51,'CHITO',195),
        (1098, 52,'EL CHORRO',195),
        (1099, 54,'LA CHONTA',195),
        (1100, 56,'PUCAPAMBA',195),
        (1101, 59,'SAN ANDRES',195),

-- //NANGARITZA
        (1102, 50,'GUAYZIMI',196),
        (1103, 51,'ZURMI',196),
        (1104, 53,'NUEVO PARAISO',196),
        (1105, 53,'NANKAIS (CAB EN SANTA ELENA)',196),

-- //YACUAMBI
        (1106, 50,'28 DE MAYO (SAN JOSE DE YACUAMBI)',197),
        (1107, 51,'LA PAZ',197),
        (1108, 52,'TUTUPALI',197),

-- //YANTZAZA
        (1109, 50,'YANTZAZA (YANZATZA)',198),
        (1110, 51,'CHICAÑA',198),
        (1111, 53,'LOS ENCUENTROS',198),

-- //EL PANGUI
        (1112, 50,'EL PANGUI',199),
        (1113, 51,'EL GUISME',199),
        (1114, 52,'PACHICUTZA',199),
        (1115, 53,'TUNDAYME',199),

-- //CENTINELA DEL CONDOR
        (1116, 50,'ZUMBI',200),
        (1117, 52,'TRIUNFO-DORADO',200),
        (1118, 53,'PANGUINTZA',200),

-- //PALANDA
        (1119, 50,'PALANDA',201),
        (1120, 51,'EL PORVENIR DEL CARMEN',201),
        (1121, 52,'SAN FRANCISCO DEL VERGEL',201),
        (1122, 53,'VALLADOLID',201),
        (1123, 54,'LA CANELA',201),

-- //PAQUISHA
        (1124, 50,'PAQUISHA',202),
        (1125, 51,'BELLAVISTA',203),
        (1126, 52,'NUEVO QUITO',203),

-- //20 GALAPAGOS SAN CRISTOBAL
        (1127, 50,'PUERTO BAQUERIZO MORENO ',204),
        (1128, 51,'EL PROGRESO',204),
        (1129, 52,'ISLA SANTA MARÍA (FLOREANA) (CAB. EN PTO. VELASCO IBARRA)',204),

-- //ISABELA
        (1130, 50,'PUERTO VILLAMIL',205),
        (1131, 51,'TOMAS DE BERLANGA (SANTO TOMAS)',205),

-- //SANTA CRUZ
        (1132, 50,'PUERTO AYORA',206),
        (1133, 51,'BELLA VISTA',206),
        (1134, 52,'SANTA ROSA',206),

/** SUCUMBIOS **/

-- //LAGO AGRIGO
        (1135, 50,'NUEVA LOJA',207),
        (1136, 52,'DURENO',207),
        (1137, 53,'GENERAL FARFAN',207),
        (1138, 55,'EL ENO',207),
        (1139, 56,'PACAYACU',207),
        (1140, 57,'JAMBELI',207),
        (1141, 58,'SANTA CECILIA',207),
        (1142, 60,'10 DE AGOSTO',207),

-- //GONZALO PIZARRO
        (1143, 50,'LUMBAQUI',208),
        (1144, 51,'EL REVENTADOR',208),
        (1145, 52,'GONZALO PIZARRO',208),
        (1146, 54,'PUERTO LIBRE',208),

-- //PUTUMAYO
        (1147, 50,'PUERTO EL CARMEN DEL PUTUMAYO',209),
        (1148, 51,'PALMA ROJA',209),
        (1149, 52,'PUERTO BOLIVAR (PUERTO MONTUFAR)',209),
        (1150, 53,'PUERTO RODRIGUEZ',209),
        (1151, 54,'SANTA ELENA',209),

-- //SHUSHUFINDI
        (1152, 50,'SHUSHUFINDI',209),
        (1153, 51,'LIMONCOCHA',209),
        (1154, 52 ,'PAÑACOCHA',209),
        (1155, 53,'SAN ROQUE (CAB. EN SAN VICENTE)',209),
        (1156, 54,'SAN PEDRO DE LOS COFANES',209),
        (1157, 55,'SIETE DE JULIO',209),

-- //SUCUMBIOS
        (1158, 55,'LA BONITA',210),
        (1159, 55,'EL PLAYON DE SAN FRANCISCO',210),
        (1160, 55,'LA SOFIA',210),
        (1161, 55,'ROSA FLORIDA',210),
        (1162, 55,'SANTA BARBARA',210),

-- //CASCALES
        (1163, 50,'EL DORADO DE CASCALES',211),
        (1164, 51,'SANTA ROSA DE SUCUMBIOS',211),
        (1165, 52,'SEVILLA',211),
        (1166, 53,'NUEVA TRONCAL (CAB EN NUEVA TRONCAL)',211),

-- //CUYABENO
        (1167, 50,'TARAPOA',212),
        (1168, 51,'CUYABENO',212),
        (1169, 52,'AGUAS NEGRAS',212),

/** ORELLANA **/

-- //ORELLANA
        (1170, 50,'PUERTO FRANCISCO DE ORELLANA (EL COCA)',213),
        (1171, 51,'DAYUMA',213),
        (1172, 52,'TARACOA (NUEVA ESPERANZA: YUCA)',213),
        (1173, 53,'ALEJANDRO LABAKA',213),
        (1174, 54,'EL DORADO',213),
        (1175, 55,'EL EDEN',213),
        (1176, 56,'GARCIA MORENO',213),
        (1177, 57,'INES ARANGO (CAB. EN WESTERN)',213),
        (1178, 58,'LA BELLEZA',213),
        (1179, 59,'NUEVO PARAISO (CAB. EN UNION)',213),
        (1180, 60,'SAN JOSE DE GUAYUSA',213),
        (1181, 61,'SAN LUIS DE ARMENIA',213),

-- //AGUARICO
        (1182, 50,'NUEVO ROCAFUERTE',214),
        (1183, 51,'CAPITAN AUGUSTO RIVADENEYRA',214),
        (1184, 52,'CONONACO',214),
        (1185, 53,'SANTA MARIA DE HUIRIRIMA',214),
        (1186, 54,'TIPUTINI',214),
        (1187, 55,'YASUNI',214),

-- //LA JOYA DE LOS SACHAS
        (1188, 50,'LA JOYA DE LOS SACHAS',215),
        (1189, 51,'ENOKANQUI',215),
        (1190, 52,'POMPEYA',215),
        (1191, 53,'SAN CARLOS',215),
        (1192, 54,'SAN SEBASTIAN DEL COCA',215),
        (1193, 55,'LAGO SAN PEDRO',215),
        (1194, 56,'RUMIPAMBA',215),
        (1195, 57,'TRES DE NOVIEMBRE',215),
        (1196, 58,'UNION MILAGREÑA',215),

-- //LORETO
        (1197, 50,'LORETO',216),
        (1198, 51,'AVILA (CAB. EN HUIRUNO)',216),
        (1199, 52,'PUERTO MURIALDO',216),
        (1200, 53,'SAN JOSE DE PAYAMINO',216),
        (1201, 54,'SAN JOSE DE DAHUANO',216),
        (1202, 55,'SAN VICENTE DE HUATICOCHA',216),

/** SANTO DOMINGO **/

-- //SANTO DOMINGO
        (1203, 55,'ABRAHAM CALAZACÓN',217),
        (1204, 55,'BOMBOLÍ',217),
        (1205, 55,'CHIGUILPE',217),
        (1206, 55,'RÍO TOACHI',217),
        (1207, 55,'RÍO VERDE',217),
        (1208, 55,'SANTO DOMINGO DE LOS COLORADOS',217),
        (1209, 55,'ZARACAY',217),
        (1210, 55,'ALLURIQUIN',217),
        (1211, 55,'PUERTO LIMON',217),
        (1212, 55,'LUZ DE AMERICA',217),
        (1213, 55,'SAN JACINTO DEL BUA',217),
        (1214, 55,'VALLE HERMOSO',217),
        (1215, 55,'EL ESFUERZO',217),
        (1216, 55,'SANTA MARIA DEL TOACHI',217),

-- //LA CONCORDIA
        (1217, 50,'LA CONCORDIA',218),
        (1218, 51,'MONTERREY',218),
        (1219, 52,'LA VILLEGAS',218),
        (1220, 53,'PLAN PILOTO',218),

/** SANTA ELENA **/

-- //SANTA ELENA
        (1221, 01,'BALLENITA',219),
        (1222, 02,'SANTA ELENA',219),
        (1223, 51,'ATAHUALPA',219),
        (1224, 52,'COLONCHE',219),
        (1225, 53,'CHANDUY',219),
        (1226, 54,'MANGLARALTO',219),
        (1227, 55,'SIMON BOLIVAR (JULIO MORENO)',219),
        (1228, 56,'SAN JOSE DE ANCON',219),

-- //LA LIBERTAD
        (1229, 50,'LA LIBERTAD',220),

-- //SALINAS
        (1230, 01,'CARLOS ESPINOZA LARREA',221),
        (1231, 02,'GENERAL ALBERTO ENRÍQUEZ GALLO',221),
        (1232, 03,'VICENTE ROCAFUERTE',221),
        (1233, 04,'SANTA ROSA',221),
        (1234, 51,'ANCONCITO',221),
        (1235, 52,'JOSE LUIS TAMAYO (MUEY)',221);

INSERT INTO bd_creditobancario.persona
(persid, pers_nombres, pers_apellidos, per_cedula, pers_fecha_nacimiento, pers_celular,
pers_telefono, pers_nacionalidad, pers_codigo_postal, pers_correo, pers_estado_civil,
pers_profesion, pers_nivel_instruccion, pers_sexo, pers_genero, pers_estado) VALUES
(1, "Bryan Enrique", "Orellana Cueva", "1104730229", "1996-08-02", "0963662450",
"0724040855", "Ecuatoriana", "010211", "bryan.orellana.g@gmail.com", "Casado",
"Programador", "Posgrado", "Hombre", "Masculino", 1),
(2, "Giuliana Estefania", "Padilla Crespo", "0106805898", "2003-01-19", "0979363153",
"072886775", "Ecuatoriana", "010101", "tefipadillacrespo@gmail.com", "Casado",
"Programador", "Posgrado", "Mujer", "Femenino", 1),
(3, "Maria Alejandra", "Orellana Padilla", "0107654321", "2011-03-18", "0958769054",
"072654789", "Ecuatoriana", "012010", "estefipadillacrespo@gmail.com", "Soltero",
"Arquitecto", "Universitario", "Mujer", "Femenino", 1),
(4, "Pablo Enrique", "Orellana Padilla", "0102312758", "2009-05-16", "0997661387",
"072123456", "Ecuatoriana", "010703", "orellanapadilla0703@gmail.com", "Soltero",
"Abogado", "Universitario", "Hombre", "Masculino", 1),
(5, "Domenica Alejandra", "Mendieta Perez", "1765498756", "2009-05-16", "0998765452",
"072357159", "Ecuatoriana", "010403", "mailconyugue10703@gmail.com", "Casada",
"Emprendedora", "Universitario", "Mujer", "Femenino", 1);

INSERT INTO bd_creditobancario.direccion(dire_id, dire_calle, dire_interseccion, dire_numero, dire_sector, 
parrid, dire_estado) VALUES
(1, "Ceresos", "Fresnos", "3-55", "Iglesia San Pedro", 13, 1),
(2, "Via al despacho", "S/N", "S/N", "Baguanchi", 21, 1),
(3, "Geronimo", "Dominica", "12-34", "Alameida", 7, 1),
(4, "Flemming", "AV.18 de noviembre", "11-758", "La Tebaida", 574, 1);

INSERT INTO bd_creditobancario.sucursal(sucuid, sucu_nombre, direcid, sucu_estado) VALUES
(1,"Cuenca", 1, 1),
(2,"Loja", 4, 1);

INSERT INTO bd_creditobancario.usuario
(usuarioid, usuario_username, usuario_password, usuario_registro,
usuario_preg_uno, usuario_preg_dos, persid, rolid, sucursalid, usuario_estado) VALUES
(1, "1104730229", "unodostres", "2023-05-16", "ROJO", "RUFO", 1,1, null, 1),
(2, "0106805898", "cuatrocincoseis", "2023-05-16", "AZUL", "KIKE", 2,2, 1, 1),
(3, "0107654321", "cuatrocincoseis", "2023-05-17", "VIOLETA", "PELUSA", 3,3, 1, 1),
(4, "0102312758", "unodostres", "2023-05-17", "ROSA", "GOLIATH", 4,4, null, 1);

INSERT INTO bd_creditobancario.destinocredito (des_credid, des_cred_categoria, des_cred_descripcion, des_cred_estado) VALUES
(1, "Vivienda", "Adquirir una vivienda", 1),
(2, "Vehiculo", "Adquirir una vehiculo", 1),
(3, "Educacion", "Financiar estudios academicos ", 1);

INSERT INTO bd_creditobancario.credito (credid, cred_numero, cred_monto, cred_plazo, cred_fecha, 
dest_credid, sucursalid, cred_estado) VALUES
(1, "030435", "5000", "12", "2023-05-18", 2, 1, 1);

INSERT INTO bd_creditobancario.anexo_credito (ane_credid, ane_cred_cedula_solicitante, credid, ane_cred_estado) VALUES
(1, 
"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", 
1, 1);

INSERT INTO bd_creditobancario.domicilio (domiid, domi_anios_residencia, domi_color, domi_referencia, domi_tenencia, 
domi_hipoteca, domi_propietario, domi_telefono_propietario, direcid, domi_estado) VALUES
(1, 6, "Ladrillo", "Porton Negro, esquinero", "Propia", null, null, null, 3, 1);

INSERT INTO bd_creditobancario.empleo (emplid, empl_tipo_empleado, empl_cargo_empresa, empl_nombre_empresa, empl_actividad_empresa,
empl_tiempo_empresa, empl_telefono_empresa, empl_referencia_empresa, direcid, empl_estado) VALUES
(1, "Empleado", "Jefe Departamental", "SocialNodos", "Consultora economica", "10", "4040855", "Edificio Miraflores", 2, 1);

INSERT INTO bd_creditobancario.gastos (gastid, gast_alimentacion, gast_educacion, gast_salud, gast_servicios_basicos, 
gast_vivienda, gast_otros, gast_total_gastos, gast_estado) VALUES
(1, 200.00, 0.00, 50.00, 150.00, 0.00, 100.00, 500.00, 1);

INSERT INTO bd_creditobancario.ingresos (ingrid, ingr_sueldo_mensual, ingr_sueldo_conyugue, ingr_ingresos_servicios, ingr_pension_jubilados,
ingr_remesas, ingr_otros_ingresos, ingr_total_ingresos, ingr_estado) VALUES
(1, 800.00, 0.00, 200.00, 0.00, 0.00, 200.00, 1200.00, 1);

INSERT INTO bd_creditobancario.referenciasbancarias (ref_bancid, ref_banc_apertura, ref_banc_cifras_promedio, ref_banc_nombre, ref_banc_numero, 
ref_banc_saldo, ref_banc_tipo, ref_banc_estado) VALUES
(1, "Sin descripcion", 1000.00, "Bnco. Pichincha", "072687567", 7000.00, "Ahorros", 1);

INSERT INTO bd_creditobancario.bienes_raices(bie_raicid, bie_raic_fecha_adquisicion, bie_raic_hipoteca, bie_raic_institucion_persona, 
bie_raic_numero_predio, bie_raic_tipo, bie_raic_valor, bie_raic_estado) VALUES 
(1, "2004-06-22", null, null, "23506", null, 75000.00, 1);

INSERT INTO bd_creditobancario.vehiculo (vehiid, vehi_placa, vehi_marca, vehi_modelo, vehi_tipo, vehi_fecha_adquisicion, 
vehi_valor, vehi_prenda, vehiculo_institucion_persona, vehi_estado) VALUES
(1, "LBY-0722", "Chevrolet", "D-MAX", "Camioneta", "2003-02-13", 22000.00, null, null, 1);

INSERT INTO bd_creditobancario.solicitud (soliid, persid, credid, domiid, emplid, conyid, ingrid, gastid, 
bie_raicid, deudid, vehiid, ref_bancid, tar_cred_id, buroid, soli_estado_registro, soli_estado) VALUES
(1, 4, 1, 1, 1, null, 1, 1, 1, null, 1, 1, null, null, "Registrado", 1);