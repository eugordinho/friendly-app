import React from "react";
import Card from "./Card";

function CardsGroups({ cardInfo }) {
  return (
    <div>
      {cardInfo.map((element) => (
        <Card
          key={`key${element.name}`}
          name={element.name}
          img={element.img}
        />
      ))}
    </div>
  );
}

export default CardsGroups;
