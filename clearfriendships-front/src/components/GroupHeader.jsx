import React from "react";

function GroupHeader({ name, img }) {
  return (
    <div>
      <img src={img} alt={`imagen de grupo ${name}`} />
      <h2>{name}</h2>
    </div>
  );
}

export default GroupHeader;
