import React from "react";
import CardsGroups from "../components/CardsGroups";
import SearchBar from "../components/SearchBar";

function Search() {
  const CARDS_DEMO = [
    {
      name: "GRUPO 1",
      img: "https://img.freepik.com/foto-gratis/comunidad-jovenes-posando-juntos_23-2148431391.jpg?size=626&ext=jpg",
    },
    {
      name: "GRUPO 3",
      img: "https://img.freepik.com/foto-gratis/hombre-mujer-jovenes-vestian-colores-bandera-lgbt-pared-blanca-modelos-caucasicos-camisas-brillantes_155003-35069.jpg?size=626&ext=jpg",
    },
  ];

  return (
    <div>
      <SearchBar />
      <CardsGroups cardInfo={CARDS_DEMO} />
    </div>
  );
}

export default Search;
