import React from "react";

function Card({ name, img }) {
  return (
    <div>
      <h3>{name}</h3>
      <img src={img} alt={`imagen de grupo ${name}`} />
    </div>
  );
}

export default Card;
