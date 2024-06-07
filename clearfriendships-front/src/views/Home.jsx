import React from "react";
import CardsGroups from "../components/CardsGroups";

// Objeto con informacion de las CARDS, se requiere nombre y foto

function Home() {
  const CARDS_DEMO = [
    {
      name: "GRUPO 1",
      img: "https://img.freepik.com/foto-gratis/comunidad-jovenes-posando-juntos_23-2148431391.jpg?size=626&ext=jpg",
    },
    {
      name: "GRUPO 2",
      img: "https://img.freepik.com/foto-gratis/concepto-comunidad-grupo-gente_23-2147993335.jpg?size=626&ext=jpg",
    },
    {
      name: "GRUPO 3",
      img: "https://img.freepik.com/foto-gratis/hombre-mujer-jovenes-vestian-colores-bandera-lgbt-pared-blanca-modelos-caucasicos-camisas-brillantes_155003-35069.jpg?size=626&ext=jpg",
    },
  ];

  return (
    <div>
      <CardsGroups cardInfo={CARDS_DEMO} />
    </div>
  );
}

export default Home;
